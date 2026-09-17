package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzaio {
    public final int zzd;

    public zzaio(int r1) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            return
    }

    public static int zze(int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public static java.lang.String zzf(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.zzd
            java.lang.String r0 = zzf(r0)
            return r0
    }
}
