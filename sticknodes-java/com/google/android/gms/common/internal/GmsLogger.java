package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class GmsLogger {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GmsLogger(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "log tag cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            int r0 = r7.length()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r3 = 23
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r1[r5] = r4
            if (r0 > r3) goto L1e
            r2 = 1
        L1e:
            java.lang.String r0 = "tag \"%s\" is longer than the %d character maximum"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0, r1)
            r6.zza = r7
            r7 = 0
            if (r8 == 0) goto L2e
            int r0 = r8.length()
            if (r0 > 0) goto L2f
        L2e:
            r8 = r7
        L2f:
            r6.zzb = r8
            return
    }

    private final java.lang.String zza(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    private final java.lang.String zzb(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.lang.String r0 = r1.zzb
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.lang.String r2 = r0.concat(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLog(int r2) {
            r1 = this;
            java.lang.String r0 = r1.zza
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean canLogPii() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.d(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void d(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 3
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.d(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.e(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.e(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void efmt(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            r0 = 6
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zzb(r3, r4)
            android.util.Log.e(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.i(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void i(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.i(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void pii(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.v(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void v(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 2
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.v(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.w(r2, r3)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void w(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto Le
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.w(r2, r3, r4)
        Le:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wfmt(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r1 = 5
            boolean r1 = r0.canLog(r1)
            if (r1 == 0) goto L10
            java.lang.String r1 = r0.zza
            java.lang.String r2 = r0.zzb(r2, r3)
            android.util.Log.w(r1, r2)
        L10:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void wtf(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 7
            boolean r0 = r1.canLog(r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = r1.zza(r3)
            android.util.Log.e(r2, r0, r4)
            java.lang.String r3 = r1.zza(r3)
            android.util.Log.wtf(r2, r3, r4)
        L15:
            return
    }
}
