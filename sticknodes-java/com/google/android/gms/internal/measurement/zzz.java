package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzz {
    final java.util.TreeMap zza;
    final java.util.TreeMap zzb;

    public zzz() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.zza = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    private static final int zzc(com.google.android.gms.internal.measurement.zzg r0, com.google.android.gms.internal.measurement.zzao r1, com.google.android.gms.internal.measurement.zzap r2) {
            java.util.List r2 = java.util.Collections.singletonList(r2)
            com.google.android.gms.internal.measurement.zzap r0 = r1.zza(r0, r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzah
            if (r1 == 0) goto L19
            java.lang.Double r0 = r0.zzh()
            double r0 = r0.doubleValue()
            int r0 = com.google.android.gms.internal.measurement.zzh.zzb(r0)
            return r0
        L19:
            r0 = -1
            return r0
    }

    public final void zza(java.lang.String r1, int r2, com.google.android.gms.internal.measurement.zzao r3, java.lang.String r4) {
            r0 = this;
            java.lang.String r1 = "create"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lb
            java.util.TreeMap r1 = r0.zzb
            goto L15
        Lb:
            java.lang.String r1 = "edit"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L33
            java.util.TreeMap r1 = r0.zza
        L15:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L2b
            java.lang.Object r2 = r1.lastKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 + 1
        L2b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r3)
            return
        L33:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown callback type: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzg r7, com.google.android.gms.internal.measurement.zzab r8) {
            r6 = this;
            com.google.android.gms.internal.measurement.zzl r0 = new com.google.android.gms.internal.measurement.zzl
            r0.<init>(r8)
            java.util.TreeMap r1 = r6.zza
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.google.android.gms.internal.measurement.zzaa r4 = r8.zzb()
            com.google.android.gms.internal.measurement.zzaa r4 = r4.zzb()
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzao r3 = (com.google.android.gms.internal.measurement.zzao) r3
            int r3 = zzc(r7, r3, r0)
            r5 = 2
            if (r3 == r5) goto L33
            r5 = -1
            if (r3 != r5) goto Lf
        L33:
            r8.zzf(r4)
            goto Lf
        L37:
            java.util.TreeMap r8 = r6.zzb
            java.util.Set r1 = r8.keySet()
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r2 = r8.get(r2)
            com.google.android.gms.internal.measurement.zzao r2 = (com.google.android.gms.internal.measurement.zzao) r2
            zzc(r7, r2, r0)
            goto L41
        L57:
            return
    }
}
