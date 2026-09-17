package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public int getMajorVersion() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int getMicroVersion() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public int getMinorVersion() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r4.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            int r2 = r4.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "%d.%d.%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
