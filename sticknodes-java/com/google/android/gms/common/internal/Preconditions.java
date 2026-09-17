package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Uninstantiable"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static double checkArgumentInRange(double r5, double r7, double r9, java.lang.String r11) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L29
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r11
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r6[r1] = r7
            java.lang.Double r7 = java.lang.Double.valueOf(r9)
            r6[r0] = r7
            java.lang.String r7 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r6 = zza(r7, r6)
            r5.<init>(r6)
            throw r5
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r11
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r6[r1] = r7
            java.lang.Double r7 = java.lang.Double.valueOf(r9)
            r6[r0] = r7
            java.lang.String r7 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r6 = zza(r7, r6)
            r5.<init>(r6)
            throw r5
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static float checkArgumentInRange(float r5, float r6, float r7, java.lang.String r8) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 < 0) goto L29
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3[r1] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            r3[r0] = r6
            java.lang.String r6 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r6 = zza(r6, r3)
            r5.<init>(r6)
            throw r5
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3[r1] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            r3[r0] = r6
            java.lang.String r6 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r6 = zza(r6, r3)
            r5.<init>(r6)
            throw r5
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int checkArgumentInRange(int r4, int r5, int r6, java.lang.String r7) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            if (r4 < r5) goto L25
            if (r4 > r6) goto L9
            return r4
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3[r0] = r5
            java.lang.String r5 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r5 = zza(r5, r3)
            r4.<init>(r5)
            throw r4
        L25:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3[r0] = r5
            java.lang.String r5 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r5 = zza(r5, r3)
            r4.<init>(r5)
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static long checkArgumentInRange(long r5, long r7, long r9, java.lang.String r11) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L29
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto Ld
            return r5
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r1] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r6[r0] = r7
            java.lang.String r7 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r6 = zza(r7, r6)
            r5.<init>(r6)
            throw r5
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r1] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r6[r0] = r7
            java.lang.String r7 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r6 = zza(r7, r6)
            r5.<init>(r6)
            throw r5
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkHandlerThread(android.os.Handler r4) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r4.getLooper()
            if (r0 == r1) goto L47
            if (r0 == 0) goto L15
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            goto L17
        L15:
            java.lang.String r0 = "null current looper"
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            android.os.Looper r4 = r4.getLooper()
            java.lang.Thread r4 = r4.getThread()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Must be called on "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " thread, but got "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = "."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L47:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkHandlerThread(android.os.Handler r1, java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkMainThread() {
            java.lang.String r0 = "Must be called on the main application thread"
            checkMainThread(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkMainThread(java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzd.zza()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String checkNotEmpty(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given String is empty or null"
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String checkNotEmpty(java.lang.String r1, java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
            java.lang.String r0 = "Must not be called on GoogleApiHandler thread."
            checkNotGoogleApiHandlerThread(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotGoogleApiHandlerThread(java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L1d
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "GoogleApiHandler"
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 != 0) goto L17
            goto L1d
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L1d:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread() {
            java.lang.String r0 = "Must not be called on the main application thread"
            checkNotMainThread(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread(java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzd.zza()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T checkNotNull(T r1) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int checkNotZero(int r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given Integer is zero"
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int checkNotZero(int r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static long checkNotZero(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given Long is zero"
            r3.<init>(r4)
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static long checkNotZero(long r3, java.lang.Object r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r3.<init>(r4)
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    static java.lang.String zza(java.lang.String r7, java.lang.Object... r8) {
            int r0 = r7.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 48
            r1.<init>(r0)
            r0 = 0
            r2 = 0
        Ld:
            r3 = 3
            if (r0 >= r3) goto L2e
            java.lang.String r4 = "%s"
            int r4 = r7.indexOf(r4, r2)
            r5 = -1
            if (r4 != r5) goto L1a
            goto L2e
        L1a:
            java.lang.String r2 = r7.substring(r2, r4)
            r1.append(r2)
            int r2 = r0 + 1
            r0 = r8[r0]
            r1.append(r0)
            int r0 = r4 + 2
            r6 = r2
            r2 = r0
            r0 = r6
            goto Ld
        L2e:
            java.lang.String r7 = r7.substring(r2)
            r1.append(r7)
            if (r0 >= r3) goto L58
            java.lang.String r7 = " ["
            r1.append(r7)
            int r7 = r0 + 1
            r0 = r8[r0]
            r1.append(r0)
        L43:
            if (r7 >= r3) goto L53
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r7 + 1
            r7 = r8[r7]
            r1.append(r7)
            r7 = r0
            goto L43
        L53:
            java.lang.String r7 = "]"
            r1.append(r7)
        L58:
            java.lang.String r7 = r1.toString()
            return r7
    }
}
