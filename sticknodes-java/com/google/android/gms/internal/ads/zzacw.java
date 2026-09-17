package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacw implements com.google.android.gms.internal.ads.zzaeh {
    private final byte[] zza;

    public zzacw() {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(com.google.android.gms.internal.ads.zzp r1, int r2, boolean r3) {
            r0 = this;
            int r1 = com.google.android.gms.internal.ads.zzaef.zza(r0, r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(com.google.android.gms.internal.ads.zzp r2, int r3, boolean r4, int r5) throws java.io.IOException {
            r1 = this;
            byte[] r5 = r1.zza
            r0 = 4096(0x1000, float:5.74E-42)
            int r3 = java.lang.Math.min(r0, r3)
            r0 = 0
            int r2 = r2.zza(r5, r0, r3)
            r3 = -1
            if (r2 != r3) goto L19
            if (r4 == 0) goto L13
            return r3
        L13:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L19:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(com.google.android.gms.internal.ads.zzaf r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzek r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzaef.zzb(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(com.google.android.gms.internal.ads.zzek r1, int r2, int r3) {
            r0 = this;
            r1.zzM(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(long r1, int r3, int r4, int r5, com.google.android.gms.internal.ads.zzaeg r6) {
            r0 = this;
            return
    }
}
