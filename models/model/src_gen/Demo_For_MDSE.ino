// Generated Arduino code for Demo For MDSE
// This a a simple model for the live demo

#include <Servo.h>
#include <DHT.h>

// DHT11 Setup - Data pin on 4
#define DHT_PIN 4
#define DHT_TYPE DHT11
DHT dht(DHT_PIN, DHT_TYPE);


Servo myServo;
unsigned long lastServoUpdate = 0;
int servoPos = 0;
int servoDirection = 2;  // 2 degrees per step

float temperature_sensor = 0.0;

void readTemperatureSensor() {
  float temp = dht.readTemperature();
  if (isnan(temp)) {
    Serial.println("ERROR Failed to read from DHT11 sensor!");
    return;
  }
  temperature_sensor = temp;
}


void checkWarningTemperature() {

  if (temperature_sensor > 30.0) {
    Serial.print("Green when OK - Temperature Sensor: ");
    Serial.println(temperature_sensor);
        digitalWrite(9, HIGH); // RED LED
    
  } else {
        digitalWrite(9, LOW); // RED LED off
    
  }



}
void checkCriticalTemperature() {

  if (temperature_sensor > 31.0) {
    Serial.print("Hey there's a problem !!  - Temperature Sensor: ");
    Serial.println(temperature_sensor);
        digitalWrite(5, HIGH); // Active Buzzer
    
  } else {
        digitalWrite(5, LOW); // Active Buzzer off
    
  }



}
void checkNormaltemperature() {



  if (temperature_sensor > 15 && temperature_sensor < 30) {
    Serial.print("Green when OK - Temperature Sensor: ");
    Serial.println(temperature_sensor);
        digitalWrite(10, HIGH); // Green LED
    
  } else {
        digitalWrite(10, LOW); // Green LED off
    
  }

}


void updateServo() {
  if (millis() - lastServoUpdate >= 10) {
    lastServoUpdate = millis();

    servoPos += servoDirection;

    if (servoPos >= 180) {
      servoDirection = -2;  // Reverse
    } else if (servoPos <= 0) {
      servoDirection = 2;   // Forward
    }

    myServo.write(servoPos);
  }
}

void setup() {
  Serial.begin(9600);
  dht.begin();

  myServo.attach(3);  // Servo on pin 3

  // Configure sensor pins
  pinMode(4, INPUT);   // Temperature Sensor on pin 4

  // Configure alert pins
  pinMode(11, OUTPUT); // Light
  pinMode(10, OUTPUT); // Light
  pinMode(9, OUTPUT); // Light
  pinMode(5, OUTPUT); // Buzz sound

  // Initialize all outputs to OFF
  digitalWrite(11, LOW);
  digitalWrite(10, LOW);
  digitalWrite(9, LOW);
  digitalWrite(5, LOW);


  Serial.println("System initialized. Monitoring...");
  delay(2000); // DHT11 needs 2s to stabilize

}

void loop() {
  updateServo();  // Non-blocking servo sweep

  readTemperatureSensor();

  Serial.print("DEBUG Temperature Sensor: ");
  Serial.print(temperature_sensor);
  Serial.println(" Degree");

  checkWarningTemperature();
  checkCriticalTemperature();
  checkNormaltemperature();


  delay(1000);
}
