package com.google.firebase.crashlytics.internal.model;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class StaticSessionData {

    @com.google.auto.value.AutoValue
    public static abstract class AppData {
        public AppData() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData create(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r13) {
                com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_AppData r7 = new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_AppData
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public abstract java.lang.String appIdentifier();

        public abstract int deliveryMechanism();

        public abstract com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider();

        public abstract java.lang.String installUuid();

        public abstract java.lang.String versionCode();

        public abstract java.lang.String versionName();
    }

    @com.google.auto.value.AutoValue
    public static abstract class DeviceData {
        public DeviceData() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData create(int r13, java.lang.String r14, int r15, long r16, long r18, boolean r20, int r21, java.lang.String r22, java.lang.String r23) {
                com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_DeviceData r12 = new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_DeviceData
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r6 = r18
                r8 = r20
                r9 = r21
                r10 = r22
                r11 = r23
                r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
                return r12
        }

        public abstract int arch();

        public abstract int availableProcessors();

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract java.lang.String manufacturer();

        public abstract java.lang.String model();

        public abstract java.lang.String modelClass();

        public abstract int state();

        public abstract long totalRam();
    }

    @com.google.auto.value.AutoValue
    public static abstract class OsData {
        public OsData() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData create(java.lang.String r1, java.lang.String r2, boolean r3) {
                com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_OsData r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_OsData
                r0.<init>(r1, r2, r3)
                return r0
        }

        public abstract boolean isRooted();

        public abstract java.lang.String osCodeName();

        public abstract java.lang.String osRelease();
    }

    public StaticSessionData() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.firebase.crashlytics.internal.model.StaticSessionData create(com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData r1, com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData r2, com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData r3) {
            com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData();

    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData();

    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData();
}
