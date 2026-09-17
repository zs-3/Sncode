package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
    private final java.lang.Boolean background;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> customAttributes;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution;
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
        private java.lang.Boolean background;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> customAttributes;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution execution;
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> internalKeys;
        private byte set$0;
        private int uiOrientation;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r2) {
                r1 = this;
                r1.<init>()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r0 = r2.getExecution()
                r1.execution = r0
                java.util.List r0 = r2.getCustomAttributes()
                r1.customAttributes = r0
                java.util.List r0 = r2.getInternalKeys()
                r1.internalKeys = r0
                java.lang.Boolean r0 = r2.getBackground()
                r1.background = r0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = r2.getCurrentProcessDetails()
                r1.currentProcessDetails = r0
                java.util.List r0 = r2.getAppProcessDetails()
                r1.appProcessDetails = r0
                int r2 = r2.getUiOrientation()
                r1.uiOrientation = r2
                r2 = 1
                r1.set$0 = r2
                return
        }

        /* synthetic */ Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application build() {
                r11 = this;
                byte r0 = r11.set$0
                r1 = 1
                if (r0 != r1) goto L1e
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r3 = r11.execution
                if (r3 != 0) goto La
                goto L1e
            La:
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r4 = r11.customAttributes
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r5 = r11.internalKeys
                java.lang.Boolean r6 = r11.background
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r7 = r11.currentProcessDetails
                java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r8 = r11.appProcessDetails
                int r9 = r11.uiOrientation
                r10 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
            L1e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r2 = r11.execution
                if (r2 != 0) goto L2c
                java.lang.String r2 = " execution"
                r0.append(r2)
            L2c:
                byte r2 = r11.set$0
                r1 = r1 & r2
                if (r1 != 0) goto L36
                java.lang.String r1 = " uiOrientation"
                r0.append(r1)
            L36:
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

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> r1) {
                r0 = this;
                r0.appProcessDetails = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setBackground(java.lang.Boolean r1) {
                r0 = this;
                r0.background = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails r1) {
                r0 = this;
                r0.currentProcessDetails = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r1) {
                r0 = this;
                r0.customAttributes = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setExecution(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution r2) {
                r1 = this;
                java.lang.String r0 = "Null execution"
                java.util.Objects.requireNonNull(r2, r0)
                r1.execution = r2
                return r1
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r1) {
                r0 = this;
                r0.internalKeys = r1
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int r1) {
                r0 = this;
                r0.uiOrientation = r1
                byte r1 = r0.set$0
                r1 = r1 | 1
                byte r1 = (byte) r1
                r0.set$0 = r1
                return r0
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution r1, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r2, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r3, java.lang.Boolean r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails r5, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.execution = r1
            r0.customAttributes = r2
            r0.internalKeys = r3
            r0.background = r4
            r0.currentProcessDetails = r5
            r0.appProcessDetails = r6
            r0.uiOrientation = r7
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution r1, java.util.List r2, java.util.List r3, java.lang.Boolean r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails r5, java.util.List r6, int r7, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.AnonymousClass1 r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
            r2 = 0
            if (r1 == 0) goto L8b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = r4.execution
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r3 = r5.getExecution()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r1 = r4.customAttributes
            if (r1 != 0) goto L22
            java.util.List r1 = r5.getCustomAttributes()
            if (r1 != 0) goto L89
            goto L2c
        L22:
            java.util.List r3 = r5.getCustomAttributes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L2c:
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r1 = r4.internalKeys
            if (r1 != 0) goto L37
            java.util.List r1 = r5.getInternalKeys()
            if (r1 != 0) goto L89
            goto L41
        L37:
            java.util.List r3 = r5.getInternalKeys()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L41:
            java.lang.Boolean r1 = r4.background
            if (r1 != 0) goto L4c
            java.lang.Boolean r1 = r5.getBackground()
            if (r1 != 0) goto L89
            goto L56
        L4c:
            java.lang.Boolean r3 = r5.getBackground()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L56:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r4.currentProcessDetails
            if (r1 != 0) goto L61
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r5.getCurrentProcessDetails()
            if (r1 != 0) goto L89
            goto L6b
        L61:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r3 = r5.getCurrentProcessDetails()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L6b:
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r1 = r4.appProcessDetails
            if (r1 != 0) goto L76
            java.util.List r1 = r5.getAppProcessDetails()
            if (r1 != 0) goto L89
            goto L80
        L76:
            java.util.List r3 = r5.getAppProcessDetails()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L80:
            int r1 = r4.uiOrientation
            int r5 = r5.getUiOrientation()
            if (r1 != r5) goto L89
            goto L8a
        L89:
            r0 = 0
        L8a:
            return r0
        L8b:
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r0 = r1.appProcessDetails
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.lang.Boolean getBackground() {
            r1 = this;
            java.lang.Boolean r0 = r1.background
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = r1.currentProcessDetails
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getCustomAttributes() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r0 = r1.customAttributes
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution getExecution() {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r0 = r1.execution
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getInternalKeys() {
            r1 = this;
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r0 = r1.internalKeys
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
            r1 = this;
            int r0 = r1.uiOrientation
            return r0
    }

    public int hashCode() {
            r4 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r0 = r4.execution
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r2 = r4.customAttributes
            r3 = 0
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r2 = r4.internalKeys
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.Boolean r2 = r4.background
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r2 = r4.currentProcessDetails
            if (r2 != 0) goto L3a
            r2 = 0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r2 = r4.appProcessDetails
            if (r2 != 0) goto L46
            goto L4a
        L46:
            int r3 = r2.hashCode()
        L4a:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            int r1 = r4.uiOrientation
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Application{execution="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = r2.execution
            r0.append(r1)
            java.lang.String r1 = ", customAttributes="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r1 = r2.customAttributes
            r0.append(r1)
            java.lang.String r1 = ", internalKeys="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r1 = r2.internalKeys
            r0.append(r1)
            java.lang.String r1 = ", background="
            r0.append(r1)
            java.lang.Boolean r1 = r2.background
            r0.append(r1)
            java.lang.String r1 = ", currentProcessDetails="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = r2.currentProcessDetails
            r0.append(r1)
            java.lang.String r1 = ", appProcessDetails="
            r0.append(r1)
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails> r1 = r2.appProcessDetails
            r0.append(r1)
            java.lang.String r1 = ", uiOrientation="
            r0.append(r1)
            int r1 = r2.uiOrientation
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
