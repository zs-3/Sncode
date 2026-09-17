package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@org.jspecify.annotations.NullMarked
/* loaded from: classes.dex */
public final class zzaa {
    private final com.google.android.gms.internal.common.zzr zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzx zzc;

    private zzaa(com.google.android.gms.internal.common.zzx r1, boolean r2, com.google.android.gms.internal.common.zzr r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.common.zzr zza(com.google.android.gms.internal.common.zzaa r0) {
            com.google.android.gms.internal.common.zzr r0 = r0.zza
            return r0
    }

    public static com.google.android.gms.internal.common.zzaa zzc(com.google.android.gms.internal.common.zzr r4) {
            com.google.android.gms.internal.common.zzaa r0 = new com.google.android.gms.internal.common.zzaa
            com.google.android.gms.internal.common.zzx r1 = new com.google.android.gms.internal.common.zzx
            r1.<init>(r4)
            com.google.android.gms.internal.common.zzr r4 = com.google.android.gms.internal.common.zzq.zza
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Iterator zze(com.google.android.gms.internal.common.zzaa r0, java.lang.CharSequence r1) {
            java.util.Iterator r0 = r0.zzh(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.internal.common.zzaa r0) {
            boolean r0 = r0.zzb
            return r0
    }

    private final java.util.Iterator zzh(java.lang.CharSequence r4) {
            r3 = this;
            com.google.android.gms.internal.common.zzw r0 = new com.google.android.gms.internal.common.zzw
            com.google.android.gms.internal.common.zzx r1 = r3.zzc
            com.google.android.gms.internal.common.zzr r2 = r1.zza
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    public final com.google.android.gms.internal.common.zzaa zzb() {
            r5 = this;
            com.google.android.gms.internal.common.zzr r0 = r5.zza
            com.google.android.gms.internal.common.zzaa r1 = new com.google.android.gms.internal.common.zzaa
            com.google.android.gms.internal.common.zzx r2 = r5.zzc
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzy r0 = new com.google.android.gms.internal.common.zzy
            r0.<init>(r1, r2)
            return r0
    }

    public final java.util.List zzf(java.lang.CharSequence r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            java.util.Iterator r3 = r2.zzh(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lc
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
