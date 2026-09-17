package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent {
    private static final com.google.firebase.crashlytics.internal.NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = null;
    private final java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> availableNativeComponent;
    private final com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> deferredNativeComponent;

    /* renamed from: com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class MissingNativeSessionFileProvider implements com.google.firebase.crashlytics.internal.NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ MissingNativeSessionFileProvider(com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getAppFile() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getDeviceFile() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getMetadataFile() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getMinidumpFile() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getOsFile() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public java.io.File getSessionFile() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* renamed from: $r8$lambda$12h5AW-t0vMV0RC2bjePziwFlY0, reason: not valid java name */
    public static /* synthetic */ void m49$r8$lambda$12h5AWt0vMV0RC2bjePziwFlY0(com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy r0, com.google.firebase.inject.Provider r1) {
            r0.lambda$new$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ROMUis85k9RYGUgfcRci5tiUs_4(java.lang.String r0, java.lang.String r1, long r2, com.google.firebase.crashlytics.internal.model.StaticSessionData r4, com.google.firebase.inject.Provider r5) {
            lambda$prepareNativeSession$1(r0, r1, r2, r4, r5)
            return
    }

    static {
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider r0 = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$MissingNativeSessionFileProvider
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy.MISSING_NATIVE_SESSION_FILE_PROVIDER = r0
            return
    }

    public CrashlyticsNativeComponentDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.availableNativeComponent = r0
            r2.deferredNativeComponent = r3
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda0 r0 = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r3.whenAvailable(r0)
            return
    }

    private /* synthetic */ void lambda$new$0(com.google.firebase.inject.Provider r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Crashlytics native component now available."
            r0.d(r1)
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r0 = r2.availableNativeComponent
            java.lang.Object r3 = r3.get()
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r3 = (com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) r3
            r0.set(r3)
            return
    }

    private static /* synthetic */ void lambda$prepareNativeSession$1(java.lang.String r6, java.lang.String r7, long r8, com.google.firebase.crashlytics.internal.model.StaticSessionData r10, com.google.firebase.inject.Provider r11) {
            java.lang.Object r11 = r11.get()
            r0 = r11
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r0 = (com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) r0
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            r0.prepareNativeSession(r1, r2, r3, r5)
            return
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public com.google.firebase.crashlytics.internal.NativeSessionFileProvider getSessionFileProvider(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r0 = r1.availableNativeComponent
            java.lang.Object r0 = r0.get()
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r0 = (com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) r0
            if (r0 != 0) goto Ld
            com.google.firebase.crashlytics.internal.NativeSessionFileProvider r2 = com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy.MISSING_NATIVE_SESSION_FILE_PROVIDER
            goto L11
        Ld:
            com.google.firebase.crashlytics.internal.NativeSessionFileProvider r2 = r0.getSessionFileProvider(r2)
        L11:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r0 = r1.availableNativeComponent
            java.lang.Object r0 = r0.get()
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r0 = (com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) r0
            if (r0 == 0) goto L12
            boolean r0 = r0.hasCrashDataForCurrentSession()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r0 = r1.availableNativeComponent
            java.lang.Object r0 = r0.get()
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r0 = (com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent) r0
            if (r0 == 0) goto L12
            boolean r2 = r0.hasCrashDataForSession(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(java.lang.String r9, java.lang.String r10, long r11, com.google.firebase.crashlytics.internal.model.StaticSessionData r13) {
            r8 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Deferring native open session: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r0 = r8.deferredNativeComponent
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda1 r7 = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda1
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r0.whenAvailable(r7)
            return
    }
}
