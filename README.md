# Project Plan

## Index Activity
- **Purpose**: To serve as a navigation menu for all the individual tasks.
- **Implementation**:
  - [x] Use a `RecyclerView` or `ListView` to list all the tasks.
  - [x] Clicking on a list item will navigate to the corresponding activity using `Intents`.

<p>
  <img src="https://github.com/user-attachments/assets/b4126a63-d211-49fb-991e-134de8a9cb8e" width="512">
</p>
  
---

## Activity Implementations

- [x] **Task 1: Display Static Message**
  - **Activity**: [`Task1Activity`](app/src/main/res/layout/activity_practical01.xml)
  - **Details**: Create a layout with a `TextView` displaying the message.
  - **Message**: "Welcome to Graphic Era University MCA"

<p>
  <img src="https://github.com/user-attachments/assets/be70bde1-41c9-4193-9049-552b6e9a017d" width="512">
</p>


---

- [x] **Task 2: Display Message on Button Click**
  - **Activity**: [`Task2Activity`](app/src/main/res/layout/activity_practical02.xml)
  - **Details**:
    - Layout with a `Button` and a `TextView`.
    - Set an `OnClickListener` on the button to display the message in the `TextView`.
  - **Message**: "Welcome to Graphic Era University - MCA"

| Image 1                                                                                         | Image 2                                                                                         |
|------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| ![image](https://github.com/user-attachments/assets/c3b3e1be-7bc6-4a4d-995c-63faad5d557d) | <img src="https://github.com/user-attachments/assets/5fb12d1f-1e15-4150-96b3-a51b69db4c50" > |

---

- [x] **Task 3: Message on Different Emulators**
  - **Activity**: [`Task3Activity`](app/src/main/res/layout/activity_practical03.xml)
  - **Details**:
    - Same as Task 1, but verify functionality across different emulator configurations (e.g., phone, tablet).
      
| Medium Phone API                                                                               | Pixel 6 Pro                                                                                         |
|------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| ![image](https://github.com/user-attachments/assets/2a0756bc-f531-4f38-910a-ded16075b634)| ![image](https://github.com/user-attachments/assets/58b29e5c-d262-47b6-9716-e69b5ab43e70)|
      

---

- [x] **Task 4: Toast Message**
  - **Activity**: [`Task4Activity`](app/src/main/res/layout/activity_practical04.xml)
  - **Details**:
    - Layout with a `Button` to trigger a `Toast` message.
    - Set duration to `Toast.LENGTH_LONG`.
  - **Message**: "Welcome to GEU - learning Android Application Development - MCA"
     
    <p>
      <img src="https://github.com/user-attachments/assets/3f5d4cd0-87a0-44c7-883c-e2fc465567b2" width=512>
    </p>

---

- [x] **Task 5: Simple Calculator**
  - **Activity**: [`Task5Activity`](app/src/main/res/layout/activity_practical05.xml)
  - **Details**:
    - Layout with:
      - `EditText` fields for inputs.
      - `Buttons` for operations (Add, Subtract, Multiply, Divide).
      - A `TextView` for displaying the result.
    - Implement basic arithmetic functionality in `OnClickListener` methods.
<p>
  <img src="https://github.com/user-attachments/assets/d7d207c7-2c8d-4d68-8a6f-1423c450028d" width=512>

</p>
---

- [x] **Task 6: Using Intents to Link Activities**
  - **Activity**: [`Task6Activity`](app/src/main/res/layout/activity_practical06.xml)
  - **Details**:
    - Two activities:
      - `Task6Activity`: Displays a button.
      - `LinkedActivity`: Displays another message.
    - Use an explicit `Intent` to navigate between these activities.
      
| Main Activity                                                                               | Intent Activity                                                                                       |
|------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| ![image](https://github.com/user-attachments/assets/6b506a9f-e1ca-495d-a055-cd9a4d1e5bdd)| ![image](https://github.com/user-attachments/assets/9b064c17-8f50-4397-81bf-b9c41e65e979)|
    

---

- [x] **Task 7: Using Intents to Navigate to a Website**
  - **Activity**: [`Task7Activity`](app/src/main/res/layout/activity_practical07.xml)
  - **Details**:
    - Layout with a `Button`.
    - Use an implicit `Intent` to navigate to the Graphic Era University website.

| Main Activity                                                                               | Intent Activity (`Web View`)                                                                |
|------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| ![image](https://github.com/user-attachments/assets/6b506a9f-e1ca-495d-a055-cd9a4d1e5bdd)| ![image](https://github.com/user-attachments/assets/c62c61f5-b7b2-4163-b698-b927423b6507)|

---

- [ ] **Task 8: Relative Layout for Login Form**
  - **Activity**: [`Task8Activity`](app/src/main/res/layout/activity_practical08.xml)
  - **Details**:
    - Layout:
      - `EditText` fields for username and password.
      - `Button` for login.
    - Use `RelativeLayout` to position the views.

---

- [ ] **Task 9: Registration Form**
  - **Activity**: [`Task9Activity`](app/src/main/res/layout/activity_practical09.xml)
  - **Details**:
    - Layout:
      - Fields: Name, Email, Phone, Event selection (dropdown/spinner).
      - `Button` for Submit.
    - Display "Registration is successful" in a `Toast` or `TextView` on submission.

---

- [ ] **Task 10: Graphics**
  - **Activity**: [`Task10Activity`](app/src/main/res/layout/activity_practical10.xml)
  - **Details**:
    - Use `Canvas` and `Paint` classes to draw a circle, triangle, and rectangle.
    - Display them on a `CustomView`.

---
