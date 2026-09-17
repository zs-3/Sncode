package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_StaticSessionData_DeviceData extends com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final java.lang.String modelClass;
    private final int state;
    private final long totalRam;

    AutoValue_StaticSessionData_DeviceData(int r1, java.lang.String r2, int r3, long r4, long r6, boolean r8, int r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.arch = r1
            java.lang.String r1 = "Null model"
            java.util.Objects.requireNonNull(r2, r1)
            r0.model = r2
            r0.availableProcessors = r3
            r0.totalRam = r4
            r0.diskSpace = r6
            r0.isEmulator = r8
            r0.state = r9
            java.lang.String r1 = "Null manufacturer"
            java.util.Objects.requireNonNull(r10, r1)
            r0.manufacturer = r10
            java.lang.String r1 = "Null modelClass"
            java.util.Objects.requireNonNull(r11, r1)
            r0.modelClass = r11
            return
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
            r1 = this;
            int r0 = r1.arch
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
            r1 = this;
            int r0 = r1.availableProcessors
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
            r2 = this;
            long r0 = r2.diskSpace
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
            r2 = 0
            if (r1 == 0) goto L66
            com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData r8 = (com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData) r8
            int r1 = r7.arch
            int r3 = r8.arch()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.model
            java.lang.String r3 = r8.model()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r7.availableProcessors
            int r3 = r8.availableProcessors()
            if (r1 != r3) goto L64
            long r3 = r7.totalRam
            long r5 = r8.totalRam()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            long r3 = r7.diskSpace
            long r5 = r8.diskSpace()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            boolean r1 = r7.isEmulator
            boolean r3 = r8.isEmulator()
            if (r1 != r3) goto L64
            int r1 = r7.state
            int r3 = r8.state()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.manufacturer
            java.lang.String r3 = r8.manufacturer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            java.lang.String r1 = r7.modelClass
            java.lang.String r8 = r8.modelClass()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L64
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            return r2
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.arch
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r7.model
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.availableProcessors
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.totalRam
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.diskSpace
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            boolean r2 = r7.isEmulator
            if (r2 == 0) goto L31
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L33
        L31:
            r2 = 1237(0x4d5, float:1.733E-42)
        L33:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.state
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r7.manufacturer
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r7.modelClass
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
            r1 = this;
            boolean r0 = r1.isEmulator
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public java.lang.String manufacturer() {
            r1 = this;
            java.lang.String r0 = r1.manufacturer
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public java.lang.String model() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public java.lang.String modelClass() {
            r1 = this;
            java.lang.String r0 = r1.modelClass
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DeviceData{arch="
            r0.append(r1)
            int r1 = r3.arch
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r3.model
            r0.append(r1)
            java.lang.String r1 = ", availableProcessors="
            r0.append(r1)
            int r1 = r3.availableProcessors
            r0.append(r1)
            java.lang.String r1 = ", totalRam="
            r0.append(r1)
            long r1 = r3.totalRam
            r0.append(r1)
            java.lang.String r1 = ", diskSpace="
            r0.append(r1)
            long r1 = r3.diskSpace
            r0.append(r1)
            java.lang.String r1 = ", isEmulator="
            r0.append(r1)
            boolean r1 = r3.isEmulator
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            int r1 = r3.state
            r0.append(r1)
            java.lang.String r1 = ", manufacturer="
            r0.append(r1)
            java.lang.String r1 = r3.manufacturer
            r0.append(r1)
            java.lang.String r1 = ", modelClass="
            r0.append(r1)
            java.lang.String r1 = r3.modelClass
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
            r2 = this;
            long r0 = r2.totalRam
            return r0
    }
}
