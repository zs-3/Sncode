package com.google.firebase.crashlytics.internal.model;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_User extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User {
    private final java.lang.String identifier;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder {
        private java.lang.String identifier;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User build() {
                r3 = this;
                java.lang.String r0 = r3.identifier
                if (r0 == 0) goto Lb
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User r1 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User
                r2 = 0
                r1.<init>(r0, r2)
                return r1
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Missing required properties:"
                r1.append(r2)
                java.lang.String r2 = " identifier"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder setIdentifier(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null identifier"
                java.util.Objects.requireNonNull(r2, r0)
                r1.identifier = r2
                return r1
        }
    }

    private AutoValue_CrashlyticsReport_Session_User(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.identifier = r1
            return
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_User(java.lang.String r1, com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
            if (r0 == 0) goto L15
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r2 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User) r2
            java.lang.String r0 = r1.identifier
            java.lang.String r2 = r2.getIdentifier()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.identifier
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.identifier
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "User{identifier="
            r0.append(r1)
            java.lang.String r1 = r2.identifier
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
