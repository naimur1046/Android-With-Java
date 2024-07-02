<p align="center">
    <img alt="Android Interview Questions" src="https://raw.githubusercontent.com/amitshekhariitbhu/android-interview-questions/master/assets/banner-android-interview-questions.jpg">
</p>

# Android Interview Questions and Answers

> Android Interview Questions and Answers - Your Cheat Sheet For Android Interview

### Prepared and maintained by [Naimur Rahman]


## **Join my program and get high paying tech job: [amitshekhar.me](https://amitshekhar.me)**

## Contents - Android Interview Questions

* [Android Interview Questions and Answers Playlist](#android-interview-questions-and-answers-playlist)
* [Android](#android)
* [Android Libraries](#android-libraries)
* [Android Architecture](#android-architecture)
* [Android System Design](#android-system-design)
* [Android Unit Testing](#android-unit-testing)
* [Android Tools And Technologies](#android-tools-and-technologies)
* [Java](#java)
* [Jetpack Compose](#jetpack-compose)
* [Other Topics](#other-topics)
* [Data Structures and Algorithms](#data-structures-and-algorithms)

### Android Interview Questions and Answers Playlist


- **Question**: What is Multidex in Android?
    - **Answer**: [What is Multidex in Android?](https://www.youtube.com/watch?v=R0zd8lmHnmE)
- **Question**: How does the Android Push Notification system work?
    - **Answer**: [How does the Android Push Notification system work?](https://www.youtube.com/watch?v=810IFG2sWlc)
- **Question**: What is a ViewModel and how is it useful?
    - **Answer**: [What is a ViewModel and how is it useful?](https://www.youtube.com/watch?v=ORtieK5f_zg)
- **Question**: Is it possible to force the Garbage Collection in Android?
    - **Answer**: [Is it possible to force Garbage Collection in Android?](https://www.youtube.com/watch?v=fPEjpFKo1-Q)
- **Question**: init block in Kotlin
    - **Answer**: [init block in Kotlin](https://www.youtube.com/watch?v=cb3jOFozJns)
- **Question**: singleTask launchMode in Android
    - **Answer**: [singleTask launchMode in Android](https://www.youtube.com/watch?v=WYkQEnm4jeI)
- **Question**: Why is it recommended to use only the default constructor to create a Fragment?
    - **Answer**: [Why is it recommended to use only the default constructor to create a Fragment?](https://www.youtube.com/watch?v=CitBt0FZFIc)
- **Question**: Why do we need to call setContentView() in onCreate() of Activity class?
    - **Answer**: [Why do we need to call setContentView() in onCreate() of Activity class?](https://www.youtube.com/watch?v=U1aHAt7XC5I)
- **Question**: When only onDestroy is called for an activity without onPause() and onStop()?
    - **Answer**: [When only onDestroy is called for an activity without onPause() and onStop()?](https://www.youtube.com/watch?v=B2kY_ckZa-g)



### Android

Android Interview Questions and Answers:

#### Base

* **Why does an Android App lag?** - [Learn from here](https://amitshekhar.me/blog/android-app-lag)

* **What is `Context`? How is it used?** - [Context In Android Application](https://amitshekhar.me/blog/context-in-android-application)

* **Tell all the Android application components.** - [Learn from here](https://developer.android.com/guide/components/fundamentals.html#Components)

* **What is the project structure of an Android Application?** - [Learn from here](https://developer.android.com/studio/projects)

* **What is `AndroidManifest.xml`?** - [Learn from here](https://developer.android.com/guide/topics/manifest/manifest-intro)

* **What is the `Application` class?**
    - The Application class in Android is the base class within an Android app that contains all other components such as activities and services. The Application class, or any subclass of the Application class, is instantiated before any other class when the process for your application/package is created.

#### Activity and Fragment

* **Why is it recommended to use only the default constructor to create a `Fragment`?** - Learn from [video](https://www.youtube.com/watch?v=CitBt0FZFIc) and [blog](https://amitshekhar.me/blog/default-constructor-to-create-a-fragment)

* **What is `Activity` and its lifecycle?** - [Learn from here](https://developer.android.com/guide/components/activities/activity-lifecycle)

* **What is the difference between onCreate() and onStart()** - [Learn from here](https://developer.android.com/guide/components/activities/activity-lifecycle)

* **When only onDestroy is called for an activity without onPause() and onStop()?** - [Learn from here](https://www.youtube.com/watch?v=B2kY_ckZa-g)

* **Why do we need to call setContentView() in onCreate() of Activity class?** - [Learn from here](https://www.youtube.com/watch?v=U1aHAt7XC5I)

* **What is onSaveInstanceState() and onRestoreInstanceState() in activity?**
    - onSaveInstanceState() - This method is used to store data before pausing the activity.
    - onRestoreInstanceState() - This method is used to recover the saved state of an activity when the activity is recreated after destruction. So, the onRestoreInstanceState() receives the bundle that contains the instance state information.

* **What is `Fragment` and its lifecycle?** - [Learn from here](https://developer.android.com/guide/fragments/lifecycle)

* **What are "launchMode"?** - [Learn from here](https://amitshekhar.me/blog/singletask-launchmode-in-android) and [singleTask launchMode in Android](https://youtu.be/WYkQEnm4jeI)

* **What is the difference between a `Fragment` and an `Activity`? Explain the relationship between the two.** - [Learn from here](https://stackoverflow.com/questions/10478233/why-fragments-and-when-to-use-fragments-instead-of-activities)

* **When should you use a Fragment rather than an Activity?**
    - When you have some UI components to be used across various activities
    - When multiple views can be displayed side by side just like ViewPager

* **What is the difference between FragmentPagerAdapter vs FragmentStatePagerAdapter?**
    - FragmentPagerAdapter: Each fragment visited by the user will be stored in the memory but the view will be destroyed. When the page is revisited, then the view will be created not the instance of the fragment.
    - FragmentStatePagerAdapter: Here, the fragment instance will be destroyed when it is not visible to the user, except the saved state of the fragment.

* **What is the difference between adding/replacing fragment in backstack?** - [Learn from here](https://stackoverflow.com/questions/24466302/basic-difference-between-add-and-replace-method-of-fragment/24466345)

* **How would you communicate between two Fragments?**

* **What is retained `Fragment`?**
    - By default, Fragments are destroyed and recreated along with their parent Activities when a configuration change occurs. Calling setRetainInstance(true) allows us to bypass this destroy-and-recreate cycle, signaling the system to retain the current instance of the fragment when the activity is recreated.

* **What is the purpose of `addToBackStack()` while commiting fragment transaction?**
    - By calling addToBackStack(), the replace transaction is saved to the back stack so the user can reverse the transaction and bring back the previous fragment by pressing the Back button. For more [Learn from here](https://stackoverflow.com/questions/22984950/what-is-the-meaning-of-addtobackstack-with-null-parameter)

#### Views and ViewGroups

* **What is `View` in Android?**

* **Difference between `View.GONE` and `View.INVISIBLE`?** - [Learn from here](https://stackoverflow.com/questions/11556607/android-difference-between-invisible-and-gone)

* **Can you a create custom view? How?**

* **What are ViewGroups and how they are different from the Views?**
    - View: View objects are the basic building blocks of User Interface(UI) elements in Android. View is a simple rectangle box which responds to the user’s actions. Examples are EditText, Button, CheckBox etc. View refers to the android.view.View class, which is the base class of all UI classes.
    - ViewGroup: ViewGroup is the invisible container. It holds View and ViewGroup. For example, LinearLayout is the ViewGroup that contains Button(View), and other Layouts also. ViewGroup is the base class for Layouts.

* **What is a Canvas?**

* **What is a `SurfaceView`?** - [Learn from here](https://developer.android.com/reference/android/view/SurfaceView)

* **Relative Layout vs Linear Layout.**

* **Tell about Constraint Layout**

* **Do you know what is the view tree? How can you optimize its depth?** - [Learn from here](https://developer.android.com/reference/android/view/ViewTreeObserver)

#### Displaying Lists of Content

* **What is the difference between `ListView` and `RecyclerView`?** - [Learn from here](https://stackoverflow.com/questions/26728651/recyclerview-vs-listview)

* **How does RecyclerView work internally?**

* **RecyclerView Optimization - Scrolling Performance Improvement** - [Learn from here](https://amitshekhar.me/blog/recyclerview-optimization)

* **Optimizing Nested RecyclerView** - [Learn from here](https://amitshekhar.me/blog/setrecycledviewpool-for-optimizing-nested-recyclerview)

* **What is `SnapHelper`?** - Learn from here: [SnapHelper](https://amitshekhar.me/blog/snaphelper)

#### Dialogs and Toasts

* **What is `Dialog` in Android?** - [Learn from here](https://developer.android.com/guide/topics/ui/dialogs)

* **What is `Toast` in Android?** - [Learn from here](https://developer.android.com/guide/topics/ui/notifiers/toasts)

* **What the difference between `Dialog` and `Dialog Fragment`?** - [Learn from here](https://stackoverflow.com/questions/7977392/android-dialogfragment-vs-dialog)

#### Intents and Broadcasting

* **What is `Intent`?** - [Learn from here](https://developer.android.com/guide/components/intents-filters)

* **What is an Implicit `Intent`?** - [Learn from here](https://developer.android.com/guide/components/intents-filters)
        
* **What is an Explicit `Intent`?** - [Learn from here](https://developer.android.com/guide/components/intents-filters)

* **What is a `BroadcastReceiver`?** - [Learn from here](https://developer.android.com/guide/components/broadcasts)

* **What is a Sticky `Intent`?**
    - Sticky Intents allows communication between a function and a service. sendStickyBroadcast() performs a sendBroadcast(Intent) known as sticky, i.e. the Intent you are sending stays around after the broadcast is complete, so that others can quickly retrieve that data through the return value of registerReceiver(BroadcastReceiver, IntentFilter). For example, if you take an intent for ACTION_BATTERY_CHANGED to get battery change events: When you call registerReceiver() for that action — even with a null BroadcastReceiver — you get the Intent that was last Broadcast for that action. Hence, you can use this to find the state of the battery without necessarily registering for all future state changes in the battery.

* **Describe how broadcasts and intents work to be able to pass messages around your app?** - [Learn from here](https://stackoverflow.com/questions/7276537/using-a-broadcast-intent-broadcast-receiver-to-send-messages-from-a-service-to-a)

* **What is a `PendingIntent`?**
    - If you want someone to perform any Intent operation at future point of time on behalf of you, then we will use Pending Intent.

* **What are the different types of Broadcasts?** - [Learn from here](https://developer.android.com/guide/components/broadcasts)

#### Services

* **What is Service?** - [Learn from here](https://developer.android.com/guide/components/services)

* **Service vs IntentService** - [Learn from here](https://stackoverflow.com/questions/15524280/service-vs-intentservice-in-the-android-platform)

* **What is a Foreground Service?** - [Learn from here](https://developer.android.com/develop/background-work/services/foreground-services)

* **What is a `JobScheduler`?** - [Learn from here](https://developer.android.com/reference/android/app/job/JobScheduler)

#### Inter-process Communication

* **How can two distinct Android apps interact?** - [Learn from here](https://developer.android.com/training/basics/intents)

* **Is it possible to run an Android app in multiple processes? How?** - [Learn from here](https://stackoverflow.com/questions/6567768/how-can-an-android-application-have-more-than-one-process)

* **What is AIDL? Enumerate the steps in creating a bounded service through AIDL.** - [Learn from here](https://developer.android.com/guide/components/aidl)

* **What can you use for background processing in Android?** - [Learn from here](https://developer.android.com/guide/background)

* **What is a `ContentProvider` and what is it typically used for?** - [Learn from here](https://developer.android.com/guide/topics/providers/content-provider-basics) and [here](https://developer.android.com/guide/topics/providers/content-providers)

#### Long-running Operations

* **How to run parallel tasks and get a callback when all are complete?** - [Long-running tasks in parallel with Kotlin Flow](https://amitshekhar.me/blog/long-running-tasks-in-parallel-with-kotlin-flow)

* **What is ANR? How can the ANR be prevented?** - [Learn from here](https://developer.android.com/topic/performance/vitals/anr.html)

* **What is an `AsyncTask`(Deprecated in API level 30) ?**

* **What are the problems in AsyncTask?**

* **Explain `Looper`, `Handler`, and `HandlerThread`.**

* **Android Memory Leak and Garbage Collection**

#### Working With Multimedia Content

* **How do you handle bitmaps in Android as it takes too much memory?** - [Learn from here](https://developer.android.com/topic/performance/graphics/load-bitmap) and [here](https://developer.android.com/topic/performance/graphics/manage-memory)

* **Tell about the `Bitmap` pool.** - [Learn from here](https://amitshekhar.me/blog/bitmap-pool)

#### Data Saving

* **Jetpack DataStore Preferences** - [Learn from here](https://amitshekhar.me/blog/jetpack-datastore-preferences)

* **How to persist data in an Android app?**

* **What is ORM? How does it work?**

* **How would you preserve the `Activity` state during a screen rotation?** - [Learn from here](https://www.youtube.com/watch?v=ORtieK5f_zg)

* **What are different ways to store data in your Android app?**

* **Explain Scoped Storage in Android.**

* **How to encrypt data in Android?**

* **What is commit() and apply() in SharedPreferences?**
    - commit() returns a boolean value of success or failure immediately by writing data synchronously.
    - apply() is asynchronous and it won't return any boolean response. If you have an apply() outstanding and you are performing commit(), then the commit() will be blocked until the apply() is not completed.

#### Look and Feel

* **What is a `Spannable`?**

* **What is a `SpannableString`?**
   - A SpannableString has immutable text, but its span information is mutable. Use a SpannableString when your text doesn't need to be changed but the styling does. Spans are ranges over the text that include styling information like color, heighliting, italics, links, etc

* **What are the best practices for using text in Android?**

* **How to implement Dark mode in any application?**

#### Memory Optimizations

* **What is the `onTrimMemory()` method?** - [Learn from here](https://developer.android.com/topic/performance/memory)

* **How to identify and fix OutOfMemory issues?**

* **How do you find memory leaks in Android applications?**

#### Battery Life Optimizations

* **How to reduce battery usage in an android application?**

* **What is Doze? What about App Standby?** - [Learn from here](https://developer.android.com/training/monitoring-device-state/doze-standby)

* **What is `overdraw`?** - [Learn from here](https://developer.android.com/topic/performance/rendering/overdraw.html)

#### Supporting Different Screen Sizes

* **How do you support different types of resolutions?** - [Learn from here](https://developer.android.com/training/multiscreen/screensizes)

#### Permissions

* **What are the different protection levels in permission?**

#### Native Programming

* **What is the NDK and why is it useful?** - Learn from here: [Android NDK and RenderScript](https://amitshekhar.me/blog/ndk-and-renderscript)

* **What is renderscript?** - Learn from here: [Android NDK and RenderScript](https://amitshekhar.me/blog/ndk-and-renderscript)

#### Android System Internal

* **What is Android Runtime?** - [Android Runtime](https://amitshekhar.me/blog/dalvik-art-jit-aot)

* **Dalvik, ART, JIT, and AOT in Android** - [Dalvik, ART, JIT, and AOT](https://amitshekhar.me/blog/dalvik-art-jit-aot)

* **What are the differences between Dalvik and ART?** - [Difference between Dalvik and ART](https://amitshekhar.me/blog/dalvik-art-jit-aot)

* **What is DEX?** - [Learn from here](https://developer.android.com/reference/dalvik/system/DexFile)

* **What is Multidex in Android?** - [Learn from here](https://www.youtube.com/watch?v=R0zd8lmHnmE)

* **Can you manually call the Garbage collector?** - [Is it possible to force Garbage Collection in Android?](https://www.youtube.com/watch?v=fPEjpFKo1-Q)

#### Android Jetpack

* **What is Android Jetpack and why to use this?**

* **What is a ViewModel and how is it useful?** Learn: [What is a ViewModel and how is it useful?](https://youtu.be/ORtieK5f_zg)

* **What are Android Architecture Components?**

* **What is LiveData in Android?**

* **How LiveData is different from ObservableField?**

* **What is the difference between setValue and postValue in LiveData?**

* **How to share ViewModel between Fragments in Android?**

* **Explain WorkManager and its use cases.**

* **How does ViewModel work internally?**

#### Others

* **Why Bundle class is used for data passing and why cannot we use simple Map data structure?** - [Learn from here](https://developer.android.com/guide/components/activities/parcelables-and-bundles)

* **How do you troubleshoot a crashing application?** - [Learn from here](https://developer.android.com/topic/performance/vitals/crash)

* **Explain the Android push notification system?** Learn from here: [How does the Android push notification system work?](https://youtu.be/810IFG2sWlc)

* **What is the difference between Serializable and Parcelable? Which is the best approach in Android?** 
    - Use the Parcelable class instead of Serializable when passing data in Intents or Bundles. The serialization of an object that implements the Parcelable interface is much faster than using Java’s default serialization. A class that implements the Serializable interface is marked as serializable, and Java serializes it using reflection (which makes it slow). When using the Parcelable interface, the whole object doesn’t get serialized automatically. Rather, you can selectively add data from the object to a Parcel using which the object is later deserialized. Similarly, you can consider the Parcelable in Kotlin.

* **What is AAPT?** - [Learn from here](https://developer.android.com/studio/command-line/aapt2)

* **FlatBuffers vs JSON.**

* **`HashMap`, `ArrayMap` and `SparseArray`** - [Learn from here](https://amitshekhar.me/blog/optimization-using-arraymap-and-sparsearray)

* **What are Annotations?** - [Learn from here](https://amitshekhar.me/blog/creating-custom-annotations)

* **How to create custom Annotation?** - [Learn from here](https://amitshekhar.me/blog/creating-custom-annotations)

* **What is the support library? Why was it introduced?**

* **What is Android Data Binding?**

### Android Libraries

Android Interview Questions and Answers:

* **Explain OkHttp Interceptor** - [Learn from here](https://amitshekhar.me/blog/okhttp-interceptor)

* **OkHttp - HTTP Caching** - [Learn from here](https://amitshekhar.me/blog/caching-with-okhttp-interceptor-and-retrofit)

* **Why do we use the Dependency Injection Framework like Dagger in Android?**

* **How does the Dagger work?**

* **How will you choose between Dagger 2 and Dagger-Hilt?**

* **What is a Component in Dagger?**

* **What is Module in Dagger?**

* **How does the custom scope work in Dagger?**

* **When to call dispose and clear on CompositeDisposable in RxJava?** - [Learn from here](https://amitshekhar.me/blog/dispose-vs-clear-compositedisposable-rxjava)

* **What is Multipart Request in Networking?**

* **What is Flow in Kotlin?** - [Learn from here](https://amitshekhar.me/blog/flow-api-in-kotlin)

* **App Startup Library** - [Learn from here](https://amitshekhar.me/blog/app-startup-library)

* **Tell me something about RxJava.**

* **How will you handle error in RxJava?**

* **FlatMap Vs Map Operator** - [Learn from here](https://amitshekhar.me/blog/rxjava-map-vs-flatmap)
    
* **When to use `Create` operator and when to use `fromCallable` operator of RxJava?** - Learn from here: [RxJava Create and fromCallable Operator](https://amitshekhar.me/blog/rxjava-create-and-fromcallable-operator)
    
* **When to use `defer` operator of RxJava?** - Learn from here: [RxJava Defer Operator](https://amitshekhar.me/blog/rxjava-defer-operator)
    
* **How are Timer, Delay, and Interval operators used in RxJava?** - [Learn from here](https://amitshekhar.me/blog/rxjava-interval-operator)

* **How to make two network calls in parallel using RxJava?** - [RxJava Zip Operator](https://amitshekhar.me/blog/rxjava-zip-operator)
    
* **Tell the difference between Concat and Merge.** - [Learn from here](https://amitshekhar.me/blog/rxjava-concat-operator) and [here](https://amitshekhar.me/blog/rxjava-merge-operator)

* **Explain Subject in RxJava?** - [Learn from here](https://amitshekhar.me/blog/rxjava-subject-publish-replay-behavior-async)

* **What are the types of Observables in RxJava?** - Learn from here: [Types Of Observables In RxJava](https://amitshekhar.me/blog/types-of-observables-in-rxjava)

* **How to implement search feature using RxJava in your application?** - Learn from here: [Instant Search Using RxJava Operators](https://amitshekhar.me/blog/instant-search-using-rxjava-operators)

* **Pagination In RecyclerView Using RxJava Operators** - [Learn from here](https://amitshekhar.me/blog/pagination-in-recyclerview-using-rxjava-operators)

* **How The Android Image Loading Library Glide and Fresco Works?** - [Learn from here](https://amitshekhar.me/blog/android-image-loading-library-optimize-memory-usage), [here](https://amitshekhar.me/blog/android-image-loading-library-use-bitmap-pool-for-responsive-ui) and [here](https://amitshekhar.me/blog/android-image-loading-library-solve-the-slow-loading-issue)

* **Difference between Schedulers.io() and Schedulers.computation() in RxJava.**

### Android Architecture

Android Interview Questions and Answers:

* **Describe the architecture of your last app.**

* **Describe MVVM.** - [MVVM Architecture](https://amitshekhar.me/blog/mvvm-architecture-android)

* **MVC vs MVP vs MVVM architecture.**

* **Clean Architecture**

### Android System Design

Android Interview Questions and Answers:

* **Design an Image Loading Library** - [Learn from here](https://amitshekhar.me/blog/android-image-loading-library-optimize-memory-usage), [here](https://amitshekhar.me/blog/android-image-loading-library-use-bitmap-pool-for-responsive-ui) and [here](https://amitshekhar.me/blog/android-image-loading-library-solve-the-slow-loading-issue)

* **Design File Downloader Library** - [Learn from here](https://github.com/amitshekhariitbhu/PRDownloader)

* **Design WhatsApp**

* **Design Instagram Stories**

* **Design Networking Library**

* **Design Facebook Near-By Friends App**

* **Design Caching Library.**

* **Design problems based on location-based app**

* **How to build an offline-first app? Explain the architecture**

* **Design LRU Cache**

* **Design Analytics Library**

* **HTTP Request vs HTTP Long-Polling vs WebSockets** - [Learn from blog](https://amitshekhar.me/blog/http-request-long-polling-websocket-sse) and [Video - HTTP Request vs HTTP Long-Polling vs WebSocket vs Server-Sent Events](https://www.youtube.com/watch?v=8ksWRX4xV-s)

* **How do Voice And Video Call Work?** - [Learn from here](https://amitshekhar.me/blog/voice-and-video-call)

* **Design Uber App** - [Learn from here](https://github.com/amitshekhariitbhu/ridesharing-uber-lyft-app)

### Android Unit Testing

Android Interview Questions and Answers:

* **Unit Testing ViewModel with Kotlin Coroutines and LiveData** - [Learn from here](https://amitshekhar.me/blog/unit-testing-viewmodel-with-kotlin-coroutines-and-livedata)

* **Unit Testing ViewModel with Kotlin Flow and StateFlow** - [Learn from here](https://amitshekhar.me/blog/unit-testing-viewmodel-with-kotlin-flow-and-stateflow)

* **What is Espresso?** - [Learn from here](https://developer.android.com/training/testing/espresso/basics)

* **What is Robolectric?** - [Learn from here](http://robolectric.org/)

* **What are the disadvantages of using Robolectric?** - [Learn from here](https://stackoverflow.com/questions/18271474/robolectric-vs-android-test-framework) 

* **What is UI-Automator?** - [Learn from here](https://developer.android.com/training/testing/ui-testing/uiautomator-testing.html)

* **Explain the unit test.** - [Learn from here](https://developer.android.com/training/testing/unit-testing/local-unit-tests)

* **Explain instrumented test.** - [Learn from here](https://developer.android.com/training/testing/unit-testing/instrumented-unit-tests)

* **Why Mockito is used?** - [Learn from here](http://site.mockito.org/)

* **Describe code coverage.**

### Android Tools And Technologies

Android Interview Questions and Answers:

* **What is ADB?** - [Learn from here](https://developer.android.com/studio/command-line/adb)

* **What is the StrictMode?** - Learn from here: [StrictMode](https://amitshekhar.me/blog/strictmode-in-android-development)

* **What is Lint? What is it used for?**

* **Git.**

* **Firebase.** - [Learn from here](https://firebase.google.com/)

* **How to measure method execution time in Android?**

* **Can you access your database of SQLite Database for debugging?** - [Learn from here](https://github.com/amitshekhariitbhu/Android-Debug-Database)

* **What are things that we need to take care while using Proguard?**

* **How to use Android Studio Memory Profiler?**

* **What is Gradle?**

* **APK Size Reduction.**

* **How can you speed up the Gradle build?**

* **About gradle build system.**

* **About multiple apk for android application.**

* **What is proguard used for?**

* **What is obfuscation? What is it used for? What about minification?**

* **How to change some parameters in an app without app update?**

### Java

Android Interview Questions and Answers:

#### OOP

* **Explain OOP Concepts.**

* **Differences between abstract classes and interfaces?** 
    - An abstract class, is a class that contains both concrete and abstract methods 
    (methods without implementations). An abstract method must be implemented by the abstract class
     sub-classes. Abstract classes cannot be instantiated and need to be extended to be used.
    - An interface is like a blueprint/contract of a class (or it may be thought of as a class with methods, but without their implementation). It contains empty methods that 
    represent, what all of its subclasses should have in common. The subclasses provide the 
    implementation for each of these methods. Interfaces are implemented.

* **Difference between method overloading and overriding.**

* **What are the access modifiers you know? What does each one do?**
   - There are four access modifiers in Java language (from strictest to the most lenient):
        1. `private` *variables*, *methods*, *constructors* or *inner classes* are only visible to its' containing class and its' methods. This modifier is most commonly used, for example, to allow variable access only through getters and setters or to hide underlying implementation of classes that should not be used by user and therefore maintain encapsulation. Singleton constructor is also marked `private` to avoid unwanted instantiation from outside.
        2. `Default` (no keyword is used) this modifier can be applied to *classes*, *variables*, *constructors* and *methods* and allows access from classes and methods inside the same package.
        3. `protected` can be used on *variables*, *methods* and *constructors* therefore allowing access only to subclasses and classes that are inside the same package as protected members' class.
        4. `public` modifier is widely-used on *classes*, *variables*, *constructors* and *methods* to grant access from any class and method anywhere. It should not be used everywhere as it implies that data marked with `public` is not sensitive and can not be used to harm the program.

* **Can an Interface implement another Interface?**
  - Yes, an interface can implement another interface (and more than one), but it needs to use `extends`, rather than `implements` keyword. And while you can not remove methods from parent interface, you can add new ones freely to your sub-interface.

* **What is Polymorphism? What about Inheritance?**

#### Collections and Generics

* **Arrays Vs ArrayLists** - [Learn from here](https://stackoverflow.com/questions/32020000/what-is-the-difference-between-an-array-arraylist-and-a-list/32020072)

* **HashSet Vs TreeSet** - [Learn from here](https://stackoverflow.com/questions/25602382/java-hashset-vs-treeset-when-should-i-use-over-other)

* **HashMap Vs Set** - [Learn from here](https://stackoverflow.com/questions/2773824/difference-between-hashset-and-hashmap)

* **Explain Generics in Java?**

#### Objects and Primitives

* **How is `String` class implemented? Why was it made immutable?**
  - There is no primitive variant of `String` class in Java language - all strings are just wrappers around underlying array of characters, which is declared `final`. This means that, once a `String` object is instantiated, it cannot be changed through normal tools of the language (Reflection still can mess things up horribly, because in Java no object is truly immutable). This is why `String` variables in classes are the first candidates to be used, when you want to override `hashCode()` and `equals()` of your class - you can be sure, that all their required contracts will be satisfied.
    > Note: The String class is immutable, so that once it is created a String object cannot be changed. The String class  has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are  immutable, what these methods really do is create and return a new string that contains the result of the operation. ([Official Java Documentation](https://docs.oracle.com/javase/tutorial/java/data/strings.html))

    This class is also unique in a sense, that, when you create an instance like this:
    ```java
    String helloWorld = "Hello, World!";
    ```
    `"Hello, World!"` is called a *literal* and compiler creates a `String` object with its' value. So
    ```java
    String capital = "Hello, World!".toUpperCase();
    ```
    is a valid statement, that, firstly, will create an object with literal value "Hello, World!" and then will create and return another object with value "HELLO, WORLD!"
  - `String` was made immutable to prevent malicious manipulation of data, when, for example, user login or other sensitive data is being send to a server.

* **What does it means to say that a `String` is immutable?**
    - It means that once created, `String` object's `char[]` (its' containing value) is declared `final` and, therefore, it can not be changed during runtime.

* **Can you list 8 primitive types in java?**
    - `byte`
    - `short`
    - `int`
    - `long`
    - `float`
    - `double`
    - `char`
    - `boolean`

* **What is the difference between an Integer and int?**
  - `int` is a primitive data type (with `boolean`, `byte`, `char`, `short`, `long`, `float` and `double`), while `Integer` (with `Boolean`, `Byte`, `Character`, `Short`,`Long`, `Float` and `Double`) is a [wrapper](https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html) class that encapsulates primitive data type, while providing useful methods to perform different tasks with it.

* **Do objects get passed by reference or value in Java? Elaborate on that.**

#### Java Memory Model and Garbage Collector

* **What is garbage collector? How does it work?**
  - All objects are allocated on the heap area managed by the JVM.
  As long as an object is being referenced, the JVM considers it alive.
  Once an object is no longer referenced and therefore is not reachable by the application code,
  the garbage collector removes it and reclaims the unused memory.

#### Concurrency

* **What does the keyword `synchronized` mean?**

* **What is a `ThreadPoolExecutor`?** - [ThreadPoolExecutor in Android](https://amitshekhar.me/blog/threadpoolexecutor-in-android)

* **What is `volatile` modifier?**

* **The classes in the atomic package expose a common set of methods: `get`, `set,`, `lazyset`, `compareAndSet`, and `weakCompareAndSet`. Please describe them.**

#### Exceptions

* **How does the `try{}`, `catch{}`, `finally` works?**

* **What is the difference between a `Checked Exception` and an `Un-Checked Exception`?**

#### Others

* **What is serialization? How do you implement it?**

* **What is `transient` modifier?**

* **What are anonymous classes?**

* **What is the difference between using `==` and `.equals` on an object?**

* **What is the `hashCode()` and `equals()` used for?**

* **When would you make an object value `final`?**

* **What are these `final`, `finally` and `finalize` keywords?**

* **What is the difference between "throw" and "throws" keyword in Java?**
    - `throws` is just used to indicated which exception is to be thrown. But the `throw` keyword is used to throw some exception from any static block or any method.

* **What does the `static` word mean in Java?**
    - In case of `static` variable it means that this variable (its' value or the object it references) spans across all instances of enclosing class (changing it in one instance affects all others), while in case of `static` methods it means that these methods can be invoked without an instance of their enclosing class. It is useful, for example, when you create util classes that need not be instantiated every time you want to use them.

* **Can a `static` method be overridden in Java?**
    - While child class can override a static method with another static method with the same signature (return type can be down-casted), it is not truly overridden - it becomes "hidden", but both methods can still be accessed under right circumstances (see question about overloading/overriding above).

* **When is a `static` block run?**
    - Code inside static block is executed only once: the first time you make an object of that class or the first time you access a static member of that class (even if you never make an object of that class).

* **What is reflection?**

* **What is Dependency Injection?**

* **Difference between `StringBuffer` and `StringBuilder`?**

* **What is the difference between fail-fast and fail-safe iterators in Java?**

* **Monitor and Synchronization**

### Jetpack Compose

Topics you should know in **Jetpack Compose** for Android Interview:

* Compose
* State: remember, rememberSaveable, MutableState
* Recomposition
* State hoisting
* Side-effects
* Modifier
* Theme
* Layout, List
* Gestures, Animation
* CompositionLocal

Learn the above-mentioned from the following links:

- [Getting Started with Compose](https://developer.android.com/jetpack/compose/tutorial)
- [Thinking in Compose](https://developer.android.com/jetpack/compose/mental-model)
- [State](https://developer.android.com/jetpack/compose/state)
- [remember vs rememberSaveable](https://amitshekhar.me/blog/remember-vs-remembersaveable)
- [Lifecycle](https://developer.android.com/jetpack/compose/lifecycle)
- [Modifiers](https://developer.android.com/jetpack/compose/modifiers)
- [Side-effects](https://developer.android.com/jetpack/compose/side-effects)
- [Phases](https://developer.android.com/jetpack/compose/phases)
- [Semantics](https://developer.android.com/jetpack/compose/semantics)
- [CompositionLocal](https://developer.android.com/jetpack/compose/compositionlocal)

### Other Topics

Android Interview Questions and Answers:

* **Describe SQLite.**

* **Have you used Room-Database?**

* **Can we identify the users who have uninstalled our application?**

* **Android Development Best Practices.** - Learn from here: [Android Development Best Practices](https://amitshekhar.me/blog/android-development-best-practices)

* **React Native vs Flutter** - Learn from here: [React Native vs Flutter](https://amitshekhar.me/blog/react-native-vs-flutter)

* **What are the metrics that you should measure continuously while android application development?** - Learn from here: [Android App Performance Metrics](https://amitshekhar.me/blog/android-app-performance-metrics)

* **How to avoid API keys from check-in into VCS?**

* **How does the Kotlin Multiplatform work?** - [Blog](https://amitshekhar.me/blog/how-does-the-kotlin-multiplatform-work)

* **How to use Memory Heap Dumps data?**

* **How to implement Dark Theme in your app?**

* **How to secure the API keys used in an Android App?**

* **Tell something about memory usage in Android.**

* **Explain Annotation processing.**

* **How does the Android Push Notification system work?** Learn from here: [How does the Android Push Notification system work?](https://youtu.be/810IFG2sWlc)

* **How to show local Notification at an exact time?**

### Data Structures and Algorithms

* **Android Developer should know these Data Structures for Next Interview** - [Check here](https://amitshekhar.me/blog/android-developer-should-know-these-data-structures-for-next-interview)

### High-quality videos to prepare for Android Interview - [Amit Shekhar YouTube Channel](https://www.youtube.com/@amitshekhar)

### High-quality blogs to prepare for Android Interview - [Check here - Blog by Amit Shekhar](https://amitshekhar.me/blog)

### Found this project useful :heart:

* Support by clicking the :star: button on the upper right of this page. :v:



