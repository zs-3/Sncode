package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public class zzam implements com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    final java.util.Map zza;

    public zzam() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzam
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.measurement.zzam r2 = (com.google.android.gms.internal.measurement.zzam) r2
            java.util.Map r0 = r1.zza
            java.util.Map r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.util.Map r1 = r6.zza
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L43
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r3
            r5 = 1
            java.lang.Object r3 = r1.get(r3)
            r4[r5] = r3
            java.lang.String r3 = "%s: %s,"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.append(r3)
            goto L17
        L3a:
            java.lang.String r1 = ","
            int r1 = r0.lastIndexOf(r1)
            r0.deleteCharAt(r1)
        L43:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.util.List zzb() {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r0 = r0.keySet()
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r2, com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r1 = this;
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            return r2
        L12:
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            r0.<init>(r2)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzaj.zza(r1, r0, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r5 = this;
            com.google.android.gms.internal.measurement.zzam r0 = new com.google.android.gms.internal.measurement.zzam
            r0.<init>()
            java.util.Map r1 = r5.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof com.google.android.gms.internal.measurement.zzal
            if (r3 == 0) goto L35
            java.util.Map r3 = r0.zza
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            r3.put(r4, r2)
            goto Lf
        L35:
            java.util.Map r3 = r0.zza
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r2.zzd()
            r3.put(r4, r2)
            goto Lf
        L4b:
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto Lf
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            return r3
        Lf:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = "[object Object]"
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.util.Iterator r0 = com.google.android.gms.internal.measurement.zzaj.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String r2, com.google.android.gms.internal.measurement.zzap r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Map r3 = r1.zza
            r3.remove(r2)
            return
        L8:
            java.util.Map r0 = r1.zza
            r0.put(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
