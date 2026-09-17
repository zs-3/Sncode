package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfti extends com.google.android.gms.internal.ads.zzftq {
    private java.lang.String zza;
    private boolean zzb;
    private byte zzc;
    private int zzd;

    zzfti() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.ads.zzftq zza(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = ""
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final com.google.android.gms.internal.ads.zzftq zzb(boolean r1) {
            r0 = this;
            byte r1 = r0.zzc
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    final com.google.android.gms.internal.ads.zzftq zzc(boolean r1) {
            r0 = this;
            r0.zzb = r1
            byte r1 = r0.zzc
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final com.google.android.gms.internal.ads.zzftr zzd() {
            r9 = this;
            byte r0 = r9.zzc
            r1 = 3
            if (r0 != r1) goto L1f
            java.lang.String r0 = r9.zza
            if (r0 == 0) goto L1f
            int r0 = r9.zzd
            if (r0 != 0) goto Le
            goto L1f
        Le:
            com.google.android.gms.internal.ads.zzftk r0 = new com.google.android.gms.internal.ads.zzftk
            java.lang.String r2 = r9.zza
            r3 = 0
            boolean r4 = r9.zzb
            r5 = 0
            r6 = 0
            int r7 = r9.zzd
            r8 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.zza
            if (r1 != 0) goto L2d
            java.lang.String r1 = " fileOwner"
            r0.append(r1)
        L2d:
            byte r1 = r9.zzc
            r1 = r1 & 1
            if (r1 != 0) goto L38
            java.lang.String r1 = " hasDifferentDmaOwner"
            r0.append(r1)
        L38:
            byte r1 = r9.zzc
            r1 = r1 & 2
            if (r1 != 0) goto L43
            java.lang.String r1 = " skipChecks"
            r0.append(r1)
        L43:
            int r1 = r9.zzd
            if (r1 != 0) goto L4c
            java.lang.String r1 = " filePurpose"
            r0.append(r1)
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final com.google.android.gms.internal.ads.zzftq zze(int r1) {
            r0 = this;
            r1 = 1
            r0.zzd = r1
            return r0
    }
}
