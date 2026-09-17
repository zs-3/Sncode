package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaiv implements com.google.android.gms.internal.ads.zzais {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;

    public zzaiv(com.google.android.gms.internal.ads.zzain r4, com.google.android.gms.internal.ads.zzaf r5) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzek r4 = r4.zza
            r3.zzc = r4
            r0 = 12
            r4.zzL(r0)
            int r0 = r4.zzp()
            java.lang.String r1 = r5.zzn
            java.lang.String r2 = "audio/raw"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L49
            int r1 = r5.zzD
            int r5 = r5.zzB
            int r1 = com.google.android.gms.internal.ads.zzeu.zzj(r1)
            int r1 = r1 * r5
            if (r0 == 0) goto L2a
            int r5 = r0 % r1
            if (r5 == 0) goto L49
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "Audio sample size mismatch. stsd sample size: "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r2 = ", stsz sample size: "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "AtomParsers"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r5)
            r0 = r1
        L49:
            if (r0 != 0) goto L4c
            r0 = -1
        L4c:
            r3.zza = r0
            int r4 = r4.zzp()
            r3.zzb = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zza() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final int zzc() {
            r2 = this;
            int r0 = r2.zza
            r1 = -1
            if (r0 != r1) goto Lb
            com.google.android.gms.internal.ads.zzek r0 = r2.zzc
            int r0 = r0.zzp()
        Lb:
            return r0
    }
}
