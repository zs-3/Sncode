package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final java.lang.String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder {
        private int arch;
        private int cores;
        private long diskSpace;
        private java.lang.String manufacturer;
        private java.lang.String model;
        private java.lang.String modelClass;
        private long ram;
        private byte set$0;
        private boolean simulator;
        private int state;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device build() {
                r15 = this;
                byte r0 = r15.set$0
                r1 = 63
                if (r0 != r1) goto L27
                java.lang.String r4 = r15.model
                if (r4 == 0) goto L27
                java.lang.String r12 = r15.manufacturer
                if (r12 == 0) goto L27
                java.lang.String r13 = r15.modelClass
                if (r13 != 0) goto L13
                goto L27
            L13:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device
                int r3 = r15.arch
                int r5 = r15.cores
                long r6 = r15.ram
                long r8 = r15.diskSpace
                boolean r10 = r15.simulator
                int r11 = r15.state
                r14 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
                return r0
            L27:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r1 = r15.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L37
                java.lang.String r1 = " arch"
                r0.append(r1)
            L37:
                java.lang.String r1 = r15.model
                if (r1 != 0) goto L40
                java.lang.String r1 = " model"
                r0.append(r1)
            L40:
                byte r1 = r15.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L4b
                java.lang.String r1 = " cores"
                r0.append(r1)
            L4b:
                byte r1 = r15.set$0
                r1 = r1 & 4
                if (r1 != 0) goto L56
                java.lang.String r1 = " ram"
                r0.append(r1)
            L56:
                byte r1 = r15.set$0
                r1 = r1 & 8
                if (r1 != 0) goto L61
                java.lang.String r1 = " diskSpace"
                r0.append(r1)
            L61:
                byte r1 = r15.set$0
                r1 = r1 & 16
                if (r1 != 0) goto L6c
                java.lang.String r1 = " simulator"
                r0.append(r1)
            L6c:
                byte r1 = r15.set$0
                r1 = r1 & 32
                if (r1 != 0) goto L77
                java.lang.String r1 = " state"
                r0.append(r1)
            L77:
                java.lang.String r1 = r15.manufacturer
                if (r1 != 0) goto L80
                java.lang.String r1 = " manufacturer"
                r0.append(r1)
            L80:
                java.lang.String r1 = r15.modelClass
                if (r1 != 0) goto L89
                java.lang.String r1 = " modelClass"
                r0.append(r1)
            L89:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setArch(int r1) {
                r0 = this;
                r0.arch = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setCores(int r1) {
                r0 = this;
                r0.cores = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setDiskSpace(long r1) {
                r0 = this;
                r0.diskSpace = r1
                byte r1 = r0.set$0
                r1 = r1 | 8
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setManufacturer(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null manufacturer"
                java.util.Objects.requireNonNull(r2, r0)
                r1.manufacturer = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModel(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null model"
                java.util.Objects.requireNonNull(r2, r0)
                r1.model = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModelClass(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null modelClass"
                java.util.Objects.requireNonNull(r2, r0)
                r1.modelClass = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setRam(long r1) {
                r0 = this;
                r0.ram = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setSimulator(boolean r1) {
                r0 = this;
                r0.simulator = r1
                byte r1 = r0.set$0
                r1 = r1 | 16
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setState(int r1) {
                r0 = this;
                r0.state = r1
                byte r1 = r0.set$0
                r1 = r1 | 32
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session_Device(int r1, java.lang.String r2, int r3, long r4, long r6, boolean r8, int r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.arch = r1
            r0.model = r2
            r0.cores = r3
            r0.ram = r4
            r0.diskSpace = r6
            r0.simulator = r8
            r0.state = r9
            r0.manufacturer = r10
            r0.modelClass = r11
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Device(int r1, java.lang.String r2, int r3, long r4, long r6, boolean r8, int r9, java.lang.String r10, java.lang.String r11, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device.AnonymousClass1 r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
            r2 = 0
            if (r1 == 0) goto L66
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device) r8
            int r1 = r7.arch
            int r3 = r8.getArch()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.model
            java.lang.String r3 = r8.getModel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r7.cores
            int r3 = r8.getCores()
            if (r1 != r3) goto L64
            long r3 = r7.ram
            long r5 = r8.getRam()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            long r3 = r7.diskSpace
            long r5 = r8.getDiskSpace()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            boolean r1 = r7.simulator
            boolean r3 = r8.isSimulator()
            if (r1 != r3) goto L64
            int r1 = r7.state
            int r3 = r8.getState()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.manufacturer
            java.lang.String r3 = r8.getManufacturer()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            java.lang.String r1 = r7.modelClass
            java.lang.String r8 = r8.getModelClass()
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

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getArch() {
            r1 = this;
            int r0 = r1.arch
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
            r1 = this;
            int r0 = r1.cores
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
            r2 = this;
            long r0 = r2.diskSpace
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getManufacturer() {
            r1 = this;
            java.lang.String r0 = r1.manufacturer
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.model
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public java.lang.String getModelClass() {
            r1 = this;
            java.lang.String r0 = r1.modelClass
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
            r2 = this;
            long r0 = r2.ram
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
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
            int r2 = r7.cores
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.ram
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
            boolean r2 = r7.simulator
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

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
            r1 = this;
            boolean r0 = r1.simulator
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Device{arch="
            r0.append(r1)
            int r1 = r3.arch
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r3.model
            r0.append(r1)
            java.lang.String r1 = ", cores="
            r0.append(r1)
            int r1 = r3.cores
            r0.append(r1)
            java.lang.String r1 = ", ram="
            r0.append(r1)
            long r1 = r3.ram
            r0.append(r1)
            java.lang.String r1 = ", diskSpace="
            r0.append(r1)
            long r1 = r3.diskSpace
            r0.append(r1)
            java.lang.String r1 = ", simulator="
            r0.append(r1)
            boolean r1 = r3.simulator
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
}
