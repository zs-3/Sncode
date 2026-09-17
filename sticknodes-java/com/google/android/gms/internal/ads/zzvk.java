package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvk implements com.google.android.gms.internal.ads.zzyl {
    private final com.google.android.gms.internal.ads.zzyl zza;
    private final com.google.android.gms.internal.ads.zzcd zzb;

    public zzvk(com.google.android.gms.internal.ads.zzyl r1, com.google.android.gms.internal.ads.zzcd r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzvk
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzvk r5 = (com.google.android.gms.internal.ads.zzvk) r5
            com.google.android.gms.internal.ads.zzyl r1 = r4.zza
            com.google.android.gms.internal.ads.zzyl r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            com.google.android.gms.internal.ads.zzcd r1 = r4.zzb
            com.google.android.gms.internal.ads.zzcd r5 = r5.zzb
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzb
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            com.google.android.gms.internal.ads.zzyl r1 = r2.zza
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzyl r0 = r1.zza
            int r2 = r0.zza(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzyl r0 = r1.zza
            int r2 = r0.zzb(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzyl r0 = r1.zza
            int r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final com.google.android.gms.internal.ads.zzaf zzd(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzyl r0 = r2.zza
            com.google.android.gms.internal.ads.zzcd r1 = r2.zzb
            int r3 = r0.zza(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r1.zzb(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final com.google.android.gms.internal.ads.zzcd zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r1.zzb
            return r0
    }
}
