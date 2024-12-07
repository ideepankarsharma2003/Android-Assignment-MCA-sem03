# Project Plan

## Index Activity
- **Purpose**: To serve as a navigation menu for all the individual tasks.
- **Implementation**:
  - [ ] Use a `RecyclerView` or `ListView` to list all the tasks.
  - [ ] Clicking on a list item will navigate to the corresponding activity using `Intents`.

---

## Activity Implementations

- [ ] **Task 1: Display Static Message**
  - **Activity**: `Task1Activity`
  - **Details**: Create a layout with a `TextView` displaying the message.
  - **Message**: "Welcome to Graphic Era University MCA"

---

- [ ] **Task 2: Display Message on Button Click**
  - **Activity**: `Task2Activity`
  - **Details**:
    - Layout with a `Button` and a `TextView`.
    - Set an `OnClickListener` on the button to display the message in the `TextView`.
  - **Message**: "Welcome to Graphic Era University - MCA"

---

- [ ] **Task 3: Message on Different Emulators**
  - **Activity**: `Task3Activity`
  - **Details**:
    - Same as Task 1, but verify functionality across different emulator configurations (e.g., phone, tablet).

---

- [ ] **Task 4: Toast Message**
  - **Activity**: `Task4Activity`
  - **Details**:
    - Layout with a `Button` to trigger a `Toast` message.
    - Set duration to `Toast.LENGTH_LONG`.
  - **Message**: "Welcome to GEU - learning Android Application Development - MCA"

---

- [ ] **Task 5: Simple Calculator**
  - **Activity**: `Task5Activity`
  - **Details**:
    - Layout with:
      - `EditText` fields for inputs.
      - `Buttons` for operations (Add, Subtract, Multiply, Divide).
      - A `TextView` for displaying the result.
    - Implement basic arithmetic functionality in `OnClickListener` methods.

---

- [ ] **Task 6: Using Intents to Link Activities**
  - **Activity**: `Task6Activity`
  - **Details**:
    - Two activities:
      - `Task6Activity`: Displays a button.
      - `LinkedActivity`: Displays another message.
    - Use an explicit `Intent` to navigate between these activities.

---

- [ ] **Task 7: Using Intents to Navigate to a Website**
  - **Activity**: `Task7Activity`
  - **Details**:
    - Layout with a `Button`.
    - Use an implicit `Intent` to navigate to the Graphic Era University website.

---

- [ ] **Task 8: Relative Layout for Login Form**
  - **Activity**: `Task8Activity`
  - **Details**:
    - Layout:
      - `EditText` fields for username and password.
      - `Button` for login.
    - Use `RelativeLayout` to position the views.

---

- [ ] **Task 9: Registration Form**
  - **Activity**: `Task9Activity`
  - **Details**:
    - Layout:
      - Fields: Name, Email, Phone, Event selection (dropdown/spinner).
      - `Button` for Submit.
    - Display "Registration is successful" in a `Toast` or `TextView` on submission.

---

- [ ] **Task 10: Graphics**
  - **Activity**: `Task10Activity`
  - **Details**:
    - Use `Canvas` and `Paint` classes to draw a circle, triangle, and rectangle.
    - Display them on a `CustomView`.

---
