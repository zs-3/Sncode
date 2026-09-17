package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final java.lang.String file;
    private final int importance;
    private final long offset;
    private final long pc;
    private final java.lang.String symbol;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private java.lang.String file;
        private int importance;
        private long offset;
        private long pc;
        private byte set$0;
        private java.lang.String symbol;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
                r11 = this;
                byte r0 = r11.set$0
                r1 = 7
                if (r0 != r1) goto L1a
                java.lang.String r5 = r11.symbol
                if (r5 != 0) goto La
                goto L1a
            La:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame
                long r3 = r11.pc
                java.lang.String r6 = r11.file
                long r7 = r11.offset
                int r9 = r11.importance
                r10 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r9, r10)
                return r0
            L1a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                byte r1 = r11.set$0
                r1 = r1 & 1
                if (r1 != 0) goto L2a
                java.lang.String r1 = " pc"
                r0.append(r1)
            L2a:
                java.lang.String r1 = r11.symbol
                if (r1 != 0) goto L33
                java.lang.String r1 = " symbol"
                r0.append(r1)
            L33:
                byte r1 = r11.set$0
                r1 = r1 & 2
                if (r1 != 0) goto L3e
                java.lang.String r1 = " offset"
                r0.append(r1)
            L3e:
                byte r1 = r11.set$0
                r1 = r1 & 4
                if (r1 != 0) goto L49
                java.lang.String r1 = " importance"
                r0.append(r1)
            L49:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(java.lang.String r1) {
                r0 = this;
                r0.file = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int r1) {
                r0 = this;
                r0.importance = r1
                byte r1 = r0.set$0
                r1 = r1 | 4
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long r1) {
                r0 = this;
                r0.offset = r1
                byte r1 = r0.set$0
                r1 = r1 | 2
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long r1) {
                r0 = this;
                r0.pc = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null symbol"
                java.util.Objects.requireNonNull(r2, r0)
                r1.symbol = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long r1, java.lang.String r3, java.lang.String r4, long r5, int r7) {
            r0 = this;
            r0.<init>()
            r0.pc = r1
            r0.symbol = r3
            r0.file = r4
            r0.offset = r5
            r0.importance = r7
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long r1, java.lang.String r3, java.lang.String r4, long r5, int r7, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5, r7)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
            r2 = 0
            if (r1 == 0) goto L4b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) r8
            long r3 = r7.pc
            long r5 = r8.getPc()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            java.lang.String r1 = r7.symbol
            java.lang.String r3 = r8.getSymbol()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            java.lang.String r1 = r7.file
            if (r1 != 0) goto L2c
            java.lang.String r1 = r8.getFile()
            if (r1 != 0) goto L49
            goto L36
        L2c:
            java.lang.String r3 = r8.getFile()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
        L36:
            long r3 = r7.offset
            long r5 = r8.getOffset()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            int r1 = r7.importance
            int r8 = r8.getImportance()
            if (r1 != r8) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            return r0
        L4b:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public java.lang.String getFile() {
            r1 = this;
            java.lang.String r0 = r1.file
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
            r1 = this;
            int r0 = r1.importance
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
            r2 = this;
            long r0 = r2.pc
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.pc
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.String r3 = r7.symbol
            int r3 = r3.hashCode()
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r3 = r7.file
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            int r3 = r3.hashCode()
        L21:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r3 = r7.offset
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r0 = r7.importance
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Frame{pc="
            r0.append(r1)
            long r1 = r3.pc
            r0.append(r1)
            java.lang.String r1 = ", symbol="
            r0.append(r1)
            java.lang.String r1 = r3.symbol
            r0.append(r1)
            java.lang.String r1 = ", file="
            r0.append(r1)
            java.lang.String r1 = r3.file
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            long r1 = r3.offset
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r3.importance
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
