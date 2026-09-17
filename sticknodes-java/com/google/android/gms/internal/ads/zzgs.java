package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgs extends com.google.android.gms.internal.ads.zzgan {
    private final java.util.Map zza;

    public zzgs(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = super.containsKey(r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.zzd(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Set r0 = r0.entrySet()
            com.google.android.gms.internal.ads.zzgq r1 = new com.google.android.gms.internal.ads.zzgq
            r1.<init>()
            java.util.Set r0 = com.google.android.gms.internal.ads.zzgcz.zzc(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = super.zze(r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final int hashCode() {
            r1 = this;
            int r0 = super.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean isEmpty() {
            r3 = this;
            java.util.Map r0 = r3.zza
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L19
            int r0 = super.size()
            if (r0 != r2) goto L1a
            r0 = 0
            boolean r0 = super.containsKey(r0)
            if (r0 == 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r1 = 1
        L1a:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Set r0 = r0.keySet()
            com.google.android.gms.internal.ads.zzgr r1 = new com.google.android.gms.internal.ads.zzgr
            r1.<init>()
            java.util.Set r0 = com.google.android.gms.internal.ads.zzgcz.zzc(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final int size() {
            r2 = this;
            int r0 = super.size()
            r1 = 0
            boolean r1 = super.containsKey(r1)
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgan, com.google.android.gms.internal.ads.zzgao
    protected final /* synthetic */ java.lang.Object zza() {
            r1 = this;
            java.util.Map r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgan
    protected final java.util.Map zzb() {
            r1 = this;
            java.util.Map r0 = r1.zza
            return r0
    }
}
