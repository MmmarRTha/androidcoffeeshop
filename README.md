# Coffee Android App

A modern, responsive Android application for browsing coffee products, built with Kotlin and
Firebase. This project demonstrates clean architecture principles and real-time data integration,
making it a great showcase for professional Android development skills.

## 🚀 Key Features

- **Real-time Product Catalog:** Fetches categories, banners, and popular items dynamically from *
  *Firebase Realtime Database**.
- **Dynamic Filtering:** Browse coffee items by specific categories (e.g., Espresso, Latte,
  Cappuccino).
- **Responsive UI:** Implements a clean, modern interface using **Material Design** components.
- **Image Loading:** Efficient image caching and loading using the **Glide** library.
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

## 📂 Project Structure

The project follows a modular structure based on Clean Architecture:

- `activities/`: UI controllers (MainActivity, SplashActivity, ItemListActivity).
- `ViewModel/`: Logic for preparing and managing data for the UI.
- `repository/`: Single source of truth for data, handling Firebase interactions.
- `domain/`: Data models representing the business entities (Category, Items, Banner).
- `adapter/`: Bridges between data sources and RecyclerViews.

## 📱 Screenshots

---
*Developed by Martha M. Nieto*
