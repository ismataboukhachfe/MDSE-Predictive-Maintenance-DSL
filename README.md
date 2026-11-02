# Model-Driven DSL for Predictive Maintenance of Servo Motors

A Domain-Specific Language (DSL) for modeling predictive maintenance of small machines, in particular **servo motors monitored by sensors on an Arduino-like board**. You model the hardware and the monitoring rules graphically, and the tool generates a ready-to-upload Arduino `.ino` sketch.

Built at **TU Ilmenau** for the *Model-Driven Software Engineering* course (Prof. Ralph Maschotta), March 2026.

📄 Full project report: [`docs/DSL for maintenance of servo motor.pdf`](docs/DSL%20for%20maintenance%20of%20servo%20motor.pdf)

## Idea

Predictive maintenance means continuously reading sensor data, detecting anomalies with configurable rules, and raising alerts through actuators before a failure happens. This DSL lets someone with only basic maintenance and Arduino knowledge describe such a system without writing embedded code.

The DSL strictly separates **structure** (physical devices and wiring) from **behavior** (monitoring logic), so hardware topology and rules can evolve independently.

## Tech stack

| Part | Technology |
|---|---|
| Metamodel | Eclipse Modeling Framework (EMF / Ecore) |
| Graphical editors | Eclipse Sirius (one structure diagram, one behavior diagram) |
| Code generation | Acceleo (model-to-text, `generate.mtl`) |
| Validation | OCL-style rules (`RangeCoherence`, `MonitoringRuleCondition`) |
| Target | Arduino (`.ino`, with `DHT.h` and `Servo.h`) |

## Metamodel

Root element: `MaintenanceSystem`, containing `SystemStructure` and `SystemBehavior`.

**Structure**
- `Board`: contains the `Machine` and `PinGroup`s. Pins are typed (`DIGITAL_IN`, `DIGITAL_OUT`, `ANALOG_IN`, `ANALOG_OUT`, `GND`, `VCC`, ...)
- `Machine`: name, model (e.g. "Servo"), manufacturer; contains `Sensor`s
- `Sensor`: `DHT11`, `DigitalTemperature`, `VibrationBigSound`, `VibrationSmallSound`
- `Alert`: actuator (`RGB_Led`, `ActiveBuzzer`, `PassiveBuzzer`)
- `Connection`: wires a source `Pin` to a target `Pin`

**Behavior**
- `MonitoringRule`: severity (Normal / Warning / Critical), enabled flag, alert color; *observes* a `Sensor` and *triggers* an `Alert`
- `Condition`: `RangeCondition`, `ThresholdCondition` (with operator), `RateOfChangeCondition`

**Why is `Alert` part of the structure?** An alert is a physical actuator that needs pins and wiring, just like a sensor. Keeping it in the structural layer (separate from `MonitoringRule`) lets several rules reuse the same actuator and keeps hardware and logic loosely coupled.

## Editors

Two Sirius diagrams keep each view simple:
1. **System Structure diagram**: boards, machines, sensors, alerts and their wiring
2. **System Behavior diagram**: monitoring rules with *observes* / *triggers* relations

Validation gives live feedback, e.g. `minRange < maxRange`, and every rule must have a condition.

## Code generation

`generate.mtl` turns any valid model into an Arduino sketch: pin setup and includes, sensor read functions, one check function per monitoring rule, and alert output via `digitalWrite` / `tone`. The sketch also includes a servo sweep simulation, debug prints and a non-blocking loop using the model's sampling time.

## Demo: overheating servo motor

[`Demo.maintenancesystem`](models/model/Arduino/model/Demo.maintenancesystem) models a servo with one DHT11 temperature sensor, an RGB LED and an active buzzer:

| Rule | Condition | Reaction |
|---|---|---|
| Normal | 15 – 30 °C | Green LED |
| Warning | > 30 °C | Red LED |
| Critical | > 31 °C | Active buzzer |

Generated output: [`Demo_For_MDSE.ino`](models/model/src_gen/Demo_For_MDSE.ino).

## Repository layout

```
models/
  metamodel/Maintenance/        Ecore metamodel (.ecore, .genmodel) + generated EMF code
  metamodel/*.edit, *.editor    Generated EMF edit and editor plugins
  model/Arduino/model/          Example models (Demo, My, My2)
  model/MaintenanceSystemDesign Sirius viewpoint (.odesign) and icons
  model/src/.../generate.mtl    Acceleo code generator
  model/src_gen/                Generated Arduino sketch
workspaces/                     Eclipse workspace skeletons
docs/                           Project report (PDF)
```

## Getting started

1. Install the **Eclipse Modeling Tools** (EMF, Sirius, Acceleo).
2. Import the projects from `models/` as existing projects.
3. Launch a runtime Eclipse from the metamodel / design projects.
4. Open `Demo.maintenancesystem` and the `representations.aird` Sirius session, or create a new model.
5. Run the Acceleo launch config (`tasks/generate.xml`) to produce the `.ino` file, then upload it with the Arduino IDE.

Hardware for the demo: Arduino Uno, DHT11 sensor, servo motor, RGB LED, active buzzer.

## Limitations and outlook

This is a deliberately minimal DSL, not an industrial solution. Behavior is modeled with simple rules; richer approaches from the course (e.g. opaque behaviors) and more sensor and condition types could be added.

## Credits

Icons in `models/model/MaintenanceSystemDesign/Icons` come from the Flat Arduino SVG Icon Kit (see the README in that folder).

Author: **Ismat Abou Khachfe**
