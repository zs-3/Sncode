package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaon {
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private java.lang.String zze;

    public zzaon(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r1) goto L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            goto L1c
        L1b:
            r4 = r0
        L1c:
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r6
            r3.zzd = r1
            r3.zze = r0
            return
    }

    private final void zzd() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "generateNewId() must be called before retrieving ids."
            r0.<init>(r1)
            throw r0
    }

    public final int zza() {
            r1 = this;
            r1.zzd()
            int r0 = r1.zzd
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            r1.zzd()
            java.lang.String r0 = r1.zze
            return r0
    }

    public final void zzc() {
            r3 = this;
            int r0 = r3.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L9
            int r0 = r3.zzb
            goto Lc
        L9:
            int r1 = r3.zzc
            int r0 = r0 + r1
        Lc:
            r3.zzd = r0
            java.lang.String r1 = r3.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.zze = r0
            return
    }
}
