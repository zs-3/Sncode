package com.google.firebase.sessions.api;

/* compiled from: FirebaseSessionsDependencies.kt */
/* loaded from: classes2.dex */
public final class FirebaseSessionsDependencies {
    public static final com.google.firebase.sessions.api.FirebaseSessionsDependencies INSTANCE = null;
    private static final java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies = null;

    /* compiled from: FirebaseSessionsDependencies.kt */
    private static final class Dependency {
        private final kotlinx.coroutines.sync.Mutex mutex;
        private com.google.firebase.sessions.api.SessionSubscriber subscriber;

        public Dependency(kotlinx.coroutines.sync.Mutex r2, com.google.firebase.sessions.api.SessionSubscriber r3) {
                r1 = this;
                java.lang.String r0 = "mutex"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mutex = r2
                r1.subscriber = r3
                return
        }

        public /* synthetic */ Dependency(kotlinx.coroutines.sync.Mutex r1, com.google.firebase.sessions.api.SessionSubscriber r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                r0 = this;
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r5 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r5
                kotlinx.coroutines.sync.Mutex r1 = r4.mutex
                kotlinx.coroutines.sync.Mutex r3 = r5.mutex
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.google.firebase.sessions.api.SessionSubscriber r1 = r4.subscriber
                com.google.firebase.sessions.api.SessionSubscriber r5 = r5.subscriber
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final kotlinx.coroutines.sync.Mutex getMutex() {
                r1 = this;
                kotlinx.coroutines.sync.Mutex r0 = r1.mutex
                return r0
        }

        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
                r1 = this;
                com.google.firebase.sessions.api.SessionSubscriber r0 = r1.subscriber
                return r0
        }

        public int hashCode() {
                r2 = this;
                kotlinx.coroutines.sync.Mutex r0 = r2.mutex
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.firebase.sessions.api.SessionSubscriber r1 = r2.subscriber
                if (r1 != 0) goto Le
                r1 = 0
                goto L12
            Le:
                int r1 = r1.hashCode()
            L12:
                int r0 = r0 + r1
                return r0
        }

        public final void setSubscriber(com.google.firebase.sessions.api.SessionSubscriber r1) {
                r0 = this;
                r0.subscriber = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Dependency(mutex="
                r0.append(r1)
                kotlinx.coroutines.sync.Mutex r1 = r2.mutex
                r0.append(r1)
                java.lang.String r1 = ", subscriber="
                r0.append(r1)
                com.google.firebase.sessions.api.SessionSubscriber r1 = r2.subscriber
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies
            r0.<init>()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies = r0
            return
    }

    private FirebaseSessionsDependencies() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void addDependency(com.google.firebase.sessions.api.SessionSubscriber.Name r6) {
            java.lang.String r0 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE
            if (r6 == r0) goto L5b
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            boolean r1 = r0.containsKey(r6)
            java.lang.String r2 = "SessionsDependencies"
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependency "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " already added."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.d(r2, r6)
            return
        L2d:
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r1 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency
            r3 = 1
            kotlinx.coroutines.sync.Mutex r3 = kotlinx.coroutines.sync.MutexKt.Mutex(r3)
            r4 = 2
            r5 = 0
            r1.<init>(r3, r5, r4, r5)
            r0.put(r6, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependency to "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " added."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.d(r2, r6)
            return
        L5b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support."
            r6.<init>(r0)
            throw r6
    }

    private final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency getDependency(com.google.firebase.sessions.api.SessionSubscriber.Name r4) {
            r3 = this;
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L15
            java.lang.String r4 = "dependencies.getOrElse(s…load time.\"\n      )\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r0
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get dependency "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Dependencies should be added at class load time."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final void register(com.google.firebase.sessions.api.SessionSubscriber r5) {
            java.lang.String r0 = "subscriber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = r5.getSessionSubscriberName()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r1 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r1 = r1.getDependency(r0)
            com.google.firebase.sessions.api.SessionSubscriber r2 = r1.getSubscriber()
            java.lang.String r3 = "Subscriber "
            java.lang.String r4 = "SessionsDependencies"
            if (r2 == 0) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " already registered."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            return
        L31:
            r1.setSubscriber(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = " registered."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            kotlinx.coroutines.sync.Mutex r5 = r1.getMutex()
            r0 = 1
            r1 = 0
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r5, r1, r0, r1)
            return
    }

    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.L$5
            java.lang.Object r5 = r0.L$4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$3
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.getMutex()
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r11 = r6.lock(r3, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lae
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lae
            r6.unlock(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.unlock(r3)
            throw r11
        Lb3:
            return r5
    }

    public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(com.google.firebase.sessions.api.SessionSubscriber.Name r4) {
            r3 = this;
            java.lang.String r0 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = r3.getDependency(r4)
            com.google.firebase.sessions.api.SessionSubscriber r0 = r0.getSubscriber()
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Subscriber "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " has not been registered."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
