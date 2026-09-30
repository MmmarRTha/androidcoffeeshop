# Coffee Android App

A modern Android application for browsing coffee products, built with Kotlin and Firebase. This
project reflects my transition into Android development, showcasing my learning in clean
architecture and real-time data integration while building practical, user-focused mobile
experiences. Work in progress.

## 🚀 Key Features

- **Real-time Product Catalog:** Fetches categories, banners, and popular items dynamically from *
  *Firebase Realtime Database**.
- **Dynamic Filtering:** Browse coffee items by specific categories (e.g., Espresso, Latte,
  Cappuccino).
- **Responsive UI:** Implements a clean, modern interface using **Material Design** components.
- **Image Loading:** Efficient image caching and loading using the **Glide**
- **Splash Screen:** Professional branded entry point for the application.

## 🛠 Tech Stack & Architecture

- **Language:** Kotlin
- **Architecture:** MVVM (Model-View-ViewModel) for a clear separation of concerns and testability.
- **UI Framework:** Android XML with **ViewBinding** for type-safe view access.
- **Networking & Backend:** Firebase Realtime Database.
- **Dependency Management:** Gradle (KTS).
- **Libraries:**
    - **Glide:** For asynchronous image loading and caching.
    - **LiveData & ViewModel:** For reactive UI updates and lifecycle management.
    - **RecyclerView:** For efficient list and grid displays.

### Architecture Overview

```
Activity (ViewBinding) → MainViewModel → MainRepository → Firebase Realtime Database
```

## 📂 Project Structure

- `activities/`: UI controllers (`SplashActivity`, `MainActivity`, `ItemListActivity`).
- `ViewModel/`: `MainViewModel` — prepares and manages data for the UI.
- `repository/`: `MainRepository` — single source of truth, handles all Firebase interactions.
- `domain/`: Data models representing the business entities (`CategoryModel`, `BannerModel`,
  `ItemsModel`).
- `adapter/`: `CategoryAdapter`, `ItemsAdapter` — bridge between data and RecyclerViews.

## 🗺 Roadmap

- [ x ] **v1.0 (current):** XML + ViewBinding, MVVM, Firebase Realtime Database, Glide
- [  ] Jetpack Compose migration
- [  ] Full clean MVVM (Hilt, Coroutines/Flow, use cases)
- [  ] Unit & UI tests

## 📱 Screenshots

<img width="1920" height="1080" alt="Screenshot_20260408_133632" src="https://github.com/user-attachments/assets/346f9667-6087-4a5a-a18c-b60bf62a3905" />