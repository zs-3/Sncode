package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class BatteryState {
    private final java.lang.Float level;
    private final boolean powerConnected;

    private BatteryState(java.lang.Float r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.powerConnected = r2
            r0.level = r1
            return
    }

    public static com.google.firebase.crashlytics.internal.common.BatteryState get(android.content.Context r4) {
            r0 = 0
            r1 = 0
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.IllegalStateException -> L19
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.IllegalStateException -> L19
            android.content.Intent r4 = r4.registerReceiver(r0, r2)     // Catch: java.lang.IllegalStateException -> L19
            if (r4 == 0) goto L23
            boolean r1 = isPowerConnected(r4)     // Catch: java.lang.IllegalStateException -> L19
            java.lang.Float r4 = getLevel(r4)     // Catch: java.lang.IllegalStateException -> L19
            r0 = r4
            goto L23
        L19:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "An error occurred getting battery state."
            r2.e(r3, r4)
        L23:
            com.google.firebase.crashlytics.internal.common.BatteryState r4 = new com.google.firebase.crashlytics.internal.common.BatteryState
            r4.<init>(r0, r1)
            return r4
    }

    private static java.lang.Float getLevel(android.content.Intent r3) {
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)
            java.lang.String r2 = "scale"
            int r3 = r3.getIntExtra(r2, r1)
            if (r0 == r1) goto L1a
            if (r3 != r1) goto L12
            goto L1a
        L12:
            float r0 = (float) r0
            float r3 = (float) r3
            float r0 = r0 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    private static boolean isPowerConnected(android.content.Intent r2) {
            java.lang.String r0 = "status"
            r1 = -1
            int r2 = r2.getIntExtra(r0, r1)
            r0 = 0
            if (r2 != r1) goto Lb
            return r0
        Lb:
            r1 = 2
            if (r2 == r1) goto L11
            r1 = 5
            if (r2 != r1) goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    public java.lang.Float getBatteryLevel() {
            r1 = this;
            java.lang.Float r0 = r1.level
            return r0
    }

    public int getBatteryVelocity() {
            r5 = this;
            boolean r0 = r5.powerConnected
            if (r0 == 0) goto L1b
            java.lang.Float r0 = r5.level
            if (r0 != 0) goto L9
            goto L1b
        L9:
            float r0 = r0.floatValue()
            double r0 = (double) r0
            r2 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L19
            r0 = 2
            return r0
        L19:
            r0 = 3
            return r0
        L1b:
            r0 = 1
            return r0
    }
}
