package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long baseAddress;
    private final java.lang.String name;
    private final long size;
    private final java.lang.String uuid;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        private long baseAddress;
        private java.lang.String name;
        private byte set$0;
        private long size;
        private java.lang.String uuid;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
                r10 = this;
                byte r0 = r10.set$0
                r1 = 3
                if (r0 != r1) goto L18
                java.lang.String r7 = r10.name
                if (r7 != 0) goto La
                goto L18
            La:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage
                long r3 = r10.baseAddress
                long r5 = r10.size
                java.lang.String r8 = r10.uuid
                r9 = 0
                r2 = r0
                r2.<init>(r3, r5, r7, r8, r9)
                return r0
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r1 = r10.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L28
                java.lang.String r1 = " baseAddress"
                r0.append(r1)
            L28:
                byte r1 = r10.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L33
                java.lang.String r1 = " size"
                r0.append(r1)
            L33:
                java.lang.String r1 = r10.name
                if (r1 != 0) goto L3c
                java.lang.String r1 = " name"
                r0.append(r1)
            L3c:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long r1) {
                r0 = this;
                r0.baseAddress = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null name"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long r1) {
                r0 = this;
                r0.size = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(java.lang.String r1) {
                r0 = this;
                r0.uuid = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long r1, long r3, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.baseAddress = r1
            r0.size = r3
            r0.name = r5
            r0.uuid = r6
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long r1, long r3, java.lang.String r5, java.lang.String r6, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r3, r5, r6)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
            r2 = 0
            if (r1 == 0) goto L43
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) r8
            long r3 = r7.baseAddress
            long r5 = r8.getBaseAddress()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L41
            long r3 = r7.size
            long r5 = r8.getSize()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L41
            java.lang.String r1 = r7.name
            java.lang.String r3 = r8.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            java.lang.String r1 = r7.uuid
            if (r1 != 0) goto L36
            java.lang.String r8 = r8.getUuid()
            if (r8 != 0) goto L41
            goto L42
        L36:
            java.lang.String r8 = r8.getUuid()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
        L43:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getBaseAddress() {
            r2 = this;
            long r0 = r2.baseAddress
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public java.lang.String getUuid() {
            r1 = this;
            java.lang.String r0 = r1.uuid
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.baseAddress
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.size
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r2 = r7.name
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.String r0 = r7.uuid
            if (r0 != 0) goto L27
            r0 = 0
            goto L2b
        L27:
            int r0 = r0.hashCode()
        L2b:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BinaryImage{baseAddress="
            r0.append(r1)
            long r1 = r3.baseAddress
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.size
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", uuid="
            r0.append(r1)
            java.lang.String r1 = r3.uuid
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
