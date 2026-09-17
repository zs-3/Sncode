package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public enum DeliveryMechanism extends java.lang.Enum<com.google.firebase.crashlytics.internal.common.DeliveryMechanism> {
    private static final /* synthetic */ com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] $VALUES = null;
    public static final com.google.firebase.crashlytics.internal.common.DeliveryMechanism APP_STORE = null;
    public static final com.google.firebase.crashlytics.internal.common.DeliveryMechanism DEVELOPER = null;
    public static final com.google.firebase.crashlytics.internal.common.DeliveryMechanism TEST_DISTRIBUTION = null;
    public static final com.google.firebase.crashlytics.internal.common.DeliveryMechanism USER_SIDELOAD = null;
    private final int id;

    private static /* synthetic */ com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] $values() {
            r0 = 4
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] r0 = new com.google.firebase.crashlytics.internal.common.DeliveryMechanism[r0]
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.DEVELOPER
            r2 = 0
            r0[r2] = r1
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.USER_SIDELOAD
            r2 = 1
            r0[r2] = r1
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.TEST_DISTRIBUTION
            r2 = 2
            r0[r2] = r1
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.APP_STORE
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = new com.google.firebase.crashlytics.internal.common.DeliveryMechanism
            java.lang.String r1 = "DEVELOPER"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism.DEVELOPER = r0
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = new com.google.firebase.crashlytics.internal.common.DeliveryMechanism
            java.lang.String r1 = "USER_SIDELOAD"
            r2 = 2
            r0.<init>(r1, r3, r2)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism.USER_SIDELOAD = r0
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = new com.google.firebase.crashlytics.internal.common.DeliveryMechanism
            java.lang.String r1 = "TEST_DISTRIBUTION"
            r3 = 3
            r0.<init>(r1, r2, r3)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism.TEST_DISTRIBUTION = r0
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = new com.google.firebase.crashlytics.internal.common.DeliveryMechanism
            java.lang.String r1 = "APP_STORE"
            r2 = 4
            r0.<init>(r1, r3, r2)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism.APP_STORE = r0
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] r0 = $values()
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism.$VALUES = r0
            return
    }

    DeliveryMechanism(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            return
    }

    public static com.google.firebase.crashlytics.internal.common.DeliveryMechanism determineFrom(java.lang.String r0) {
            if (r0 == 0) goto L5
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.APP_STORE
            goto L7
        L5:
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.DEVELOPER
        L7:
            return r0
    }

    public static com.google.firebase.crashlytics.internal.common.DeliveryMechanism valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.crashlytics.internal.common.DeliveryMechanism> r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = (com.google.firebase.crashlytics.internal.common.DeliveryMechanism) r1
            return r1
    }

    public static com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] values() {
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] r0 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism[] r0 = (com.google.firebase.crashlytics.internal.common.DeliveryMechanism[]) r0
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.id
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }
}
