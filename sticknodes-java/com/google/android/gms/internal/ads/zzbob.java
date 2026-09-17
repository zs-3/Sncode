package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbob implements com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzboa {
    private final com.google.android.gms.internal.ads.zzboa zza;
    private final java.util.HashSet zzb;

    public zzbob(com.google.android.gms.internal.ads.zzboa r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbnd
    public final void zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzboa r0 = r1.zza
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void zzb(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzc(r0, r1, r2)
            return
    }

    public final void zzc() {
            r4 = this;
            java.util.HashSet r0 = r4.zzb
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.util.AbstractMap$SimpleEntry r1 = (java.util.AbstractMap.SimpleEntry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.internal.ads.zzbjw r2 = (com.google.android.gms.internal.ads.zzbjw) r2
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unregistering eventhandler: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            com.google.android.gms.internal.ads.zzboa r2 = r4.zza
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.zzbjw r1 = (com.google.android.gms.internal.ads.zzbjw) r1
            r2.zzr(r3, r1)
            goto L6
        L3b:
            java.util.HashSet r0 = r4.zzb
            r0.clear()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void zzd(java.lang.String r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmt, com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void zze(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzb(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void zzl(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzd(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void zzq(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzboa r0 = r1.zza
            r0.zzq(r2, r3)
            java.util.AbstractMap$SimpleEntry r0 = new java.util.AbstractMap$SimpleEntry
            r0.<init>(r2, r3)
            java.util.HashSet r2 = r1.zzb
            r2.add(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void zzr(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzboa r0 = r1.zza
            r0.zzr(r2, r3)
            java.util.AbstractMap$SimpleEntry r0 = new java.util.AbstractMap$SimpleEntry
            r0.<init>(r2, r3)
            java.util.HashSet r2 = r1.zzb
            r2.remove(r0)
            return
    }
}
