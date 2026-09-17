package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzug extends com.google.android.gms.internal.ads.zztx {
    private final java.util.HashMap zza;
    private android.os.Handler zzb;
    private com.google.android.gms.internal.ads.zzhh zzc;

    protected zzug() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    protected abstract void zzA(java.lang.Object r1, com.google.android.gms.internal.ads.zzva r2, com.google.android.gms.internal.ads.zzcc r3);

    protected final void zzB(java.lang.Object r5, com.google.android.gms.internal.ads.zzva r6) {
            r4 = this;
            java.util.HashMap r0 = r4.zza
            boolean r0 = r0.containsKey(r5)
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            com.google.android.gms.internal.ads.zzud r0 = new com.google.android.gms.internal.ads.zzud
            r0.<init>(r4, r5)
            com.google.android.gms.internal.ads.zzue r1 = new com.google.android.gms.internal.ads.zzue
            r1.<init>(r4, r5)
            com.google.android.gms.internal.ads.zzuf r2 = new com.google.android.gms.internal.ads.zzuf
            r2.<init>(r6, r0, r1)
            java.util.HashMap r3 = r4.zza
            r3.put(r5, r2)
            android.os.Handler r5 = r4.zzb
            java.util.Objects.requireNonNull(r5)
            r6.zzh(r5, r1)
            android.os.Handler r5 = r4.zzb
            java.util.Objects.requireNonNull(r5)
            r6.zzg(r5, r1)
            com.google.android.gms.internal.ads.zzhh r5 = r4.zzc
            com.google.android.gms.internal.ads.zzom r1 = r4.zzb()
            r6.zzm(r0, r5, r1)
            boolean r5 = r4.zzu()
            if (r5 != 0) goto L41
            r6.zzi(r0)
        L41:
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final void zzj() {
            r3 = this;
            java.util.HashMap r0 = r3.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzuf r1 = (com.google.android.gms.internal.ads.zzuf) r1
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzuz r1 = r1.zzb
            r2.zzi(r1)
            goto La
        L1e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final void zzl() {
            r3 = this;
            java.util.HashMap r0 = r3.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzuf r1 = (com.google.android.gms.internal.ads.zzuf) r1
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzuz r1 = r1.zzb
            r2.zzk(r1)
            goto La
        L1e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected void zzn(com.google.android.gms.internal.ads.zzhh r1) {
            r0 = this;
            r0.zzc = r1
            r1 = 0
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzeu.zzx(r1)
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected void zzq() {
            r4 = this;
            java.util.HashMap r0 = r4.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzuf r1 = (com.google.android.gms.internal.ads.zzuf) r1
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzuz r3 = r1.zzb
            r2.zzp(r3)
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzue r3 = r1.zzc
            r2.zzs(r3)
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzue r1 = r1.zzc
            r2.zzr(r1)
            goto La
        L2c:
            java.util.HashMap r0 = r4.zza
            r0.clear()
            return
    }

    protected int zzw(java.lang.Object r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected long zzx(java.lang.Object r1, long r2, com.google.android.gms.internal.ads.zzuy r4) {
            r0 = this;
            return r2
    }

    protected com.google.android.gms.internal.ads.zzuy zzy(java.lang.Object r1, com.google.android.gms.internal.ads.zzuy r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public void zzz() throws java.io.IOException {
            r2 = this;
            java.util.HashMap r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzuf r1 = (com.google.android.gms.internal.ads.zzuf) r1
            com.google.android.gms.internal.ads.zzva r1 = r1.zza
            r1.zzz()
            goto La
        L1c:
            return
    }
}
