package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaol {
    public final int zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final java.util.List zzd;
    public final byte[] zze;

    public zzaol(int r1, java.lang.String r2, int r3, java.util.List r4, byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            if (r4 != 0) goto L10
            java.util.List r1 = java.util.Collections.emptyList()
            goto L14
        L10:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
        L14:
            r0.zzd = r1
            r0.zze = r5
            return
    }

    public final int zza() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 2
            if (r0 == r1) goto Ld
            r1 = 3
            if (r0 == r1) goto La
            r0 = 0
            return r0
        La:
            r0 = 512(0x200, float:7.175E-43)
            return r0
        Ld:
            r0 = 2048(0x800, float:2.87E-42)
            return r0
    }
}
