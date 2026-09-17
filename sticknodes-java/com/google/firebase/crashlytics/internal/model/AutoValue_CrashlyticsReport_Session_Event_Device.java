package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device {
    private final java.lang.Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder {
        private java.lang.Double batteryLevel;
        private int batteryVelocity;
        private long diskUsed;
        private int orientation;
        private boolean proximityOn;
        private long ramUsed;
        private byte set$0;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device build() {
                r12 = this;
                byte r0 = r12.set$0
                r1 = 31
                if (r0 == r1) goto L59
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r1 = r12.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L16
                java.lang.String r1 = " batteryVelocity"
                r0.append(r1)
            L16:
                byte r1 = r12.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L21
                java.lang.String r1 = " proximityOn"
                r0.append(r1)
            L21:
                byte r1 = r12.set$0
                r1 = r1 & 4
                if (r1 != 0) goto L2c
                java.lang.String r1 = " orientation"
                r0.append(r1)
            L2c:
                byte r1 = r12.set$0
                r1 = r1 & 8
                if (r1 != 0) goto L37
                java.lang.String r1 = " ramUsed"
                r0.append(r1)
            L37:
                byte r1 = r12.set$0
                r1 = r1 & 16
                if (r1 != 0) goto L42
                java.lang.String r1 = " diskUsed"
                r0.append(r1)
            L42:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L59:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device
                java.lang.Double r3 = r12.batteryLevel
                int r4 = r12.batteryVelocity
                boolean r5 = r12.proximityOn
                int r6 = r12.orientation
                long r7 = r12.ramUsed
                long r9 = r12.diskUsed
                r11 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r11)
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(java.lang.Double r1) {
                r0 = this;
                r0.batteryLevel = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int r1) {
                r0 = this;
                r0.batteryVelocity = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long r1) {
                r0 = this;
                r0.diskUsed = r1
                byte r1 = r0.set$0
                r1 = r1 | 16
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setOrientation(int r1) {
                r0 = this;
                r0.orientation = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean r1) {
                r0 = this;
                r0.proximityOn = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long r1) {
                r0 = this;
                r0.ramUsed = r1
                byte r1 = r0.set$0
                r1 = r1 | 8
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(java.lang.Double r1, int r2, boolean r3, int r4, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.batteryLevel = r1
            r0.batteryVelocity = r2
            r0.proximityOn = r3
            r0.orientation = r4
            r0.ramUsed = r5
            r0.diskUsed = r7
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Device(java.lang.Double r1, int r2, boolean r3, int r4, long r5, long r7, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device.AnonymousClass1 r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
            r2 = 0
            if (r1 == 0) goto L4f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device) r8
            java.lang.Double r1 = r7.batteryLevel
            if (r1 != 0) goto L16
            java.lang.Double r1 = r8.getBatteryLevel()
            if (r1 != 0) goto L4d
            goto L20
        L16:
            java.lang.Double r3 = r8.getBatteryLevel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
        L20:
            int r1 = r7.batteryVelocity
            int r3 = r8.getBatteryVelocity()
            if (r1 != r3) goto L4d
            boolean r1 = r7.proximityOn
            boolean r3 = r8.isProximityOn()
            if (r1 != r3) goto L4d
            int r1 = r7.orientation
            int r3 = r8.getOrientation()
            if (r1 != r3) goto L4d
            long r3 = r7.ramUsed
            long r5 = r8.getRamUsed()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L4d
            long r3 = r7.diskUsed
            long r5 = r8.getDiskUsed()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
        L4f:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public java.lang.Double getBatteryLevel() {
            r1 = this;
            java.lang.Double r0 = r1.batteryLevel
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
            r1 = this;
            int r0 = r1.batteryVelocity
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
            r2 = this;
            long r0 = r2.diskUsed
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
            r1 = this;
            int r0 = r1.orientation
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
            r2 = this;
            long r0 = r2.ramUsed
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.Double r0 = r7.batteryLevel
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r7.batteryVelocity
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r7.proximityOn
            if (r2 == 0) goto L1c
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L1e
        L1c:
            r2 = 1237(0x4d5, float:1.733E-42)
        L1e:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.orientation
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.ramUsed
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r1 = r7.diskUsed
            long r3 = r1 >>> r4
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
            r1 = this;
            boolean r0 = r1.proximityOn
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Device{batteryLevel="
            r0.append(r1)
            java.lang.Double r1 = r3.batteryLevel
            r0.append(r1)
            java.lang.String r1 = ", batteryVelocity="
            r0.append(r1)
            int r1 = r3.batteryVelocity
            r0.append(r1)
            java.lang.String r1 = ", proximityOn="
            r0.append(r1)
            boolean r1 = r3.proximityOn
            r0.append(r1)
            java.lang.String r1 = ", orientation="
            r0.append(r1)
            int r1 = r3.orientation
            r0.append(r1)
            java.lang.String r1 = ", ramUsed="
            r0.append(r1)
            long r1 = r3.ramUsed
            r0.append(r1)
            java.lang.String r1 = ", diskUsed="
            r0.append(r1)
            long r1 = r3.diskUsed
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
