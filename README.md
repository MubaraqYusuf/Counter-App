# 📘 Counter App

## 🧠 Overview
This Android application counts different text metrics based on user selection.  
Users can enter text, select a metric (Sentences, Words, Characters, or Numbers), and view the count after pressing a button.  

The app is built using **Android Studio (Java)** and follows proper coding standards and modular design.

---

## 🚀 Features
- Counts **Sentences**, **Words**, **Characters**, and **Numbers**
- Uses a **Spinner** for user selection
- Results displayed in a **TextView**
- Validates input (non-empty text)
- Uses **Toast** messages for feedback
- Strings and labels are stored in **`strings.xml`**
- Logic separated into a **utility class** (`CounterUtils.java`)
- **Regex** used for two metrics as required

---

## 🧩 App Components

### **1. MainActivity.java**
- Handles UI interactions
- Reads user input and selection
- Validates text
- Calls appropriate counting function from `CounterUtils.java`
- Displays result in `TextView`

### **2. CounterUtils.java**
Contains all counting logic:
- `countSentences()` → uses regex `[.!?]+`
- `countWords()` → splits text by `[\s,\.,,]+`
- `countChars()` → uses `.length()`
- `countNumbers()` → uses regex `\d+`

### **3. activity_main.xml**
Defines layout elements:
- `EditText` for user input  
- `Spinner` for metric selection  
- `Button` to trigger counting  
- `TextView` for displaying result  

### **4. strings.xml**
Contains all UI text and string resources:
- Labels, hints, button text
- Toast messages
- Spinner options

---

## ✅ Requirements Checklist

| # | Requirement | Status | Implementation |
|---|--------------|---------|----------------|
| 1 | Text entered via TextEdit | ✅ | `EditText` with id `txtInput` |
| 2 | Spinner for selection (Sentences, Words, Chars, Numbers) | ✅ | `Spinner` with array from `strings.xml` |
| 3 | Counting triggered by Button click | ✅ | `btnCount.setOnClickListener()` |
| 4 | Results shown in TextView | ✅ | `txtResult.setText()` |
| 5 | Counting logic in separate class | ✅ | `CounterUtils.java` |
| 6 | Two metrics use regex, others not | ✅ | Sentences & Numbers use regex |
| 7 | Words separated by spaces, commas, dots | ✅ | Regex `[\s,\.]+` |
| 8 | Labels from strings resource file | ✅ | All text from `strings.xml` |
| 9 | Validate input, show Toast if empty | ✅ | `if (inputText.trim().isEmpty())` |

---

## 🛠️ How to Run
1. Download and extract the project.
2. Open Android Studio → **Open Existing Project** → select folder.
3. Build and Run on emulator or device.
4. Enter text → choose metric → click **Count** → view result.

---

## 📁 File Structure
```
app/
 ├── java/
 │    └── com/example/wordcounter/
 │         ├── MainActivity.java
 │         └── CounterUtils.java
 └── res/
      ├── layout/activity_main.xml
      └── values/strings.xml
```

---

## 🧪 Example
**Input:**  
`Hello world. This is 2025!`  
**Metric:** Sentences → **Count:** 2  
**Metric:** Words → **Count:** 5  
**Metric:** Numbers → **Count:** 1  
**Metric:** Characters → **Count:** 28  

---

## 🧾 Notes
- App uses **regex** only for **Sentences** and **Numbers**.
- Logic is modular and easily testable.

