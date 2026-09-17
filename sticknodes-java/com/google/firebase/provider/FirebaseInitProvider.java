package com.google.firebase.provider;

/* loaded from: classes2.dex */
public class FirebaseInitProvider extends android.content.ContentProvider {
    private static java.util.concurrent.atomic.AtomicBoolean currentlyInitializing;
    private static com.google.firebase.StartupTime startupTime;

    static {
            com.google.firebase.StartupTime r0 = com.google.firebase.StartupTime.now()
            com.google.firebase.provider.FirebaseInitProvider.startupTime = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing = r0
            return
    }

    public FirebaseInitProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void checkContentProviderAuthority(android.content.pm.ProviderInfo r1) {
            java.lang.String r0 = "FirebaseInitProvider ProviderInfo cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r1 = r1.authority
            java.lang.String r0 = "com.google.firebase.firebaseinitprovider"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle."
            r1.<init>(r0)
            throw r1
    }

    public static com.google.firebase.StartupTime getStartupTime() {
            com.google.firebase.StartupTime r0 = com.google.firebase.provider.FirebaseInitProvider.startupTime
            return r0
    }

    public static boolean isCurrentlyInitializing() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing
            boolean r0 = r0.get()
            return r0
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r1, android.content.pm.ProviderInfo r2) {
            r0 = this;
            checkContentProviderAuthority(r2)
            super.attachInfo(r1, r2)
            return
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r3 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing     // Catch: java.lang.Throwable -> L24
            r2 = 1
            r1.set(r2)     // Catch: java.lang.Throwable -> L24
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L24
            com.google.firebase.FirebaseApp r1 = com.google.firebase.FirebaseApp.initializeApp(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "FirebaseInitProvider"
            if (r1 != 0) goto L19
            java.lang.String r1 = "FirebaseApp initialization unsuccessful"
            android.util.Log.i(r2, r1)     // Catch: java.lang.Throwable -> L24
            goto L1e
        L19:
            java.lang.String r1 = "FirebaseApp initialization successful"
            android.util.Log.i(r2, r1)     // Catch: java.lang.Throwable -> L24
        L1e:
            java.util.concurrent.atomic.AtomicBoolean r1 = com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing
            r1.set(r0)
            return r0
        L24:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing
            r2.set(r0)
            throw r1
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
