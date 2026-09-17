package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final java.lang.String code;
    private final java.lang.String name;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private long address;
        private java.lang.String code;
        private java.lang.String name;
        private byte set$0;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
                r8 = this;
                byte r0 = r8.set$0
                r1 = 1
                if (r0 != r1) goto L18
                java.lang.String r3 = r8.name
                if (r3 == 0) goto L18
                java.lang.String r4 = r8.code
                if (r4 != 0) goto Le
                goto L18
            Le:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal
                long r5 = r8.address
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r7)
                return r0
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r8.name
                if (r2 != 0) goto L26
                java.lang.String r2 = " name"
                r0.append(r2)
            L26:
                java.lang.String r2 = r8.code
                if (r2 != 0) goto L2f
                java.lang.String r2 = " code"
                r0.append(r2)
            L2f:
                byte r2 = r8.set$0
                r1 = r1 & r2
                if (r1 != 0) goto L39
                java.lang.String r1 = " address"
                r0.append(r1)
            L39:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long r1) {
                r0 = this;
                r0.address = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null code"
                java.util.Objects.requireNonNull(r2, r0)
                r1.code = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null name"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(java.lang.String r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.code = r2
            r0.address = r3
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(java.lang.String r1, java.lang.String r2, long r3, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
            r2 = 0
            if (r1 == 0) goto L30
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal) r8
            java.lang.String r1 = r7.name
            java.lang.String r3 = r8.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            java.lang.String r1 = r7.code
            java.lang.String r3 = r8.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            long r3 = r7.address
            long r5 = r8.getAddress()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public long getAddress() {
            r2 = this;
            long r0 = r2.address
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.name
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r5.code
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r1 = r5.address
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Signal{name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.String r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = ", address="
            r0.append(r1)
            long r1 = r3.address
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
