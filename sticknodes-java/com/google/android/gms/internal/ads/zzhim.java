package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhim extends com.google.android.gms.internal.ads.zzhie {
    static {
            java.util.Map r0 = java.util.Collections.emptyMap()
            com.google.android.gms.internal.ads.zzhij.zza(r0)
            return
    }

    /* synthetic */ zzhim(java.util.Map r1, com.google.android.gms.internal.ads.zzhik r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.gms.internal.ads.zzhil zzc(int r2) {
            com.google.android.gms.internal.ads.zzhil r0 = new com.google.android.gms.internal.ads.zzhil
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            java.util.Map r0 = r1.zzd()
            return r0
    }

    public final java.util.Map zzd() {
            r4 = this;
            java.util.Map r0 = r4.zza()
            int r0 = r0.size()
            java.util.LinkedHashMap r0 = com.google.android.gms.internal.ads.zzhif.zzb(r0)
            java.util.Map r1 = r4.zza()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.ads.zzhir r2 = (com.google.android.gms.internal.ads.zzhir) r2
            java.lang.Object r2 = r2.zzb()
            r0.put(r3, r2)
            goto L18
        L36:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
