package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzax {
    final java.util.Map zza;
    final com.google.android.gms.internal.measurement.zzbj zzb;

    public zzax() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.measurement.zzbj r0 = new com.google.android.gms.internal.measurement.zzbj
            r0.<init>()
            r1.zzb = r0
            com.google.android.gms.internal.measurement.zzav r0 = new com.google.android.gms.internal.measurement.zzav
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzay r0 = new com.google.android.gms.internal.measurement.zzay
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzaz r0 = new com.google.android.gms.internal.measurement.zzaz
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzbc r0 = new com.google.android.gms.internal.measurement.zzbc
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzbh r0 = new com.google.android.gms.internal.measurement.zzbh
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzbi r0 = new com.google.android.gms.internal.measurement.zzbi
            r0.<init>()
            r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzbk r0 = new com.google.android.gms.internal.measurement.zzbk
            r0.<init>()
            r1.zzb(r0)
            return
    }

    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r4, com.google.android.gms.internal.measurement.zzap r5) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzh.zzc(r4)
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzaq
            if (r0 == 0) goto L27
            com.google.android.gms.internal.measurement.zzaq r5 = (com.google.android.gms.internal.measurement.zzaq) r5
            java.util.ArrayList r0 = r5.zzc()
            java.lang.String r5 = r5.zzb()
            java.util.Map r1 = r3.zza
            boolean r2 = r1.containsKey(r5)
            if (r2 == 0) goto L20
            java.lang.Object r1 = r1.get(r5)
            com.google.android.gms.internal.measurement.zzaw r1 = (com.google.android.gms.internal.measurement.zzaw) r1
            goto L22
        L20:
            com.google.android.gms.internal.measurement.zzbj r1 = r3.zzb
        L22:
            com.google.android.gms.internal.measurement.zzap r4 = r1.zza(r5, r4, r0)
            return r4
        L27:
            return r5
    }

    final void zzb(com.google.android.gms.internal.measurement.zzaw r4) {
            r3 = this;
            java.util.List r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzbl r1 = (com.google.android.gms.internal.measurement.zzbl) r1
            java.lang.Integer r1 = r1.zzb()
            java.lang.String r1 = r1.toString()
            java.util.Map r2 = r3.zza
            r2.put(r1, r4)
            goto L6
        L20:
            return
    }
}
