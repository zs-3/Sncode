package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmz implements com.google.android.gms.internal.measurement.zznt {
    private static final com.google.android.gms.internal.measurement.zznf zza = null;
    private final com.google.android.gms.internal.measurement.zznf zzb;

    static {
            com.google.android.gms.internal.measurement.zzmx r0 = new com.google.android.gms.internal.measurement.zzmx
            r0.<init>()
            com.google.android.gms.internal.measurement.zzmz.zza = r0
            return
    }

    public zzmz() {
            r4 = this;
            com.google.android.gms.internal.measurement.zzmy r0 = new com.google.android.gms.internal.measurement.zzmy
            r1 = 2
            com.google.android.gms.internal.measurement.zznf[] r1 = new com.google.android.gms.internal.measurement.zznf[r1]
            com.google.android.gms.internal.measurement.zzly r2 = com.google.android.gms.internal.measurement.zzly.zza()
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.measurement.zznf r2 = com.google.android.gms.internal.measurement.zzmz.zza
            int r3 = com.google.android.gms.internal.measurement.zznp.zza
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r4.<init>()
            byte[] r1 = com.google.android.gms.internal.measurement.zzmk.zzb
            r4.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final com.google.android.gms.internal.measurement.zzns zza(java.lang.Class r9) {
            r8 = this;
            int r0 = com.google.android.gms.internal.measurement.zznu.zza
            java.lang.Class<com.google.android.gms.internal.measurement.zzmd> r0 = com.google.android.gms.internal.measurement.zzmd.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.internal.measurement.zznp.zza
        Lc:
            com.google.android.gms.internal.measurement.zznf r0 = r8.zzb
            com.google.android.gms.internal.measurement.zzne r2 = r0.zzb(r9)
            boolean r0 = r2.zzb()
            if (r0 != 0) goto L40
            int r0 = com.google.android.gms.internal.measurement.zznp.zza
            com.google.android.gms.internal.measurement.zznm r3 = com.google.android.gms.internal.measurement.zznn.zza()
            com.google.android.gms.internal.measurement.zzmu r4 = com.google.android.gms.internal.measurement.zzmv.zza()
            com.google.android.gms.internal.measurement.zzoe r5 = com.google.android.gms.internal.measurement.zznu.zzm()
            int r0 = r2.zzc()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto L34
            com.google.android.gms.internal.measurement.zzlq r0 = com.google.android.gms.internal.measurement.zzls.zza()
            goto L35
        L34:
            r0 = 0
        L35:
            r6 = r0
            com.google.android.gms.internal.measurement.zznc r7 = com.google.android.gms.internal.measurement.zznd.zza()
            r1 = r9
            com.google.android.gms.internal.measurement.zznk r9 = com.google.android.gms.internal.measurement.zznk.zzl(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L40:
            int r9 = com.google.android.gms.internal.measurement.zznp.zza
            com.google.android.gms.internal.measurement.zzoe r9 = com.google.android.gms.internal.measurement.zznu.zzm()
            com.google.android.gms.internal.measurement.zzlq r0 = com.google.android.gms.internal.measurement.zzls.zza()
            com.google.android.gms.internal.measurement.zznh r1 = r2.zza()
            com.google.android.gms.internal.measurement.zznl r9 = com.google.android.gms.internal.measurement.zznl.zzc(r9, r0, r1)
            return r9
    }
}
