package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzy {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private java.lang.String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzic zzd;
    private java.util.BitSet zze;
    private java.util.BitSet zzf;
    private java.util.Map zzg;
    private java.util.Map zzh;

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzae r1, java.lang.String r2, com.google.android.gms.internal.measurement.zzic r3, java.util.BitSet r4, java.util.BitSet r5, java.util.Map r6, java.util.Map r7, com.google.android.gms.measurement.internal.zzad r8) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.zzh = r1
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r5 = r7.get(r2)
            java.lang.Long r5 = (java.lang.Long) r5
            r4.add(r5)
            java.util.Map r5 = r0.zzh
            r5.put(r2, r4)
            goto L1c
        L3c:
            r1 = 0
            r0.zzc = r1
            r0.zzd = r3
            return
    }

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzae r1, java.lang.String r2, com.google.android.gms.measurement.internal.zzad r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r1 = 1
            r0.zzc = r1
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r0.zze = r1
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r0.zzf = r1
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.zzg = r1
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ java.util.BitSet zzb(com.google.android.gms.measurement.internal.zzy r0) {
            java.util.BitSet r0 = r0.zze
            return r0
    }

    final com.google.android.gms.internal.measurement.zzhi zza(int r7) {
            r6 = this;
            com.google.android.gms.internal.measurement.zzhh r0 = com.google.android.gms.internal.measurement.zzhi.zzb()
            r0.zza(r7)
            boolean r7 = r6.zzc
            r0.zzc(r7)
            com.google.android.gms.internal.measurement.zzic r7 = r6.zzd
            if (r7 == 0) goto L13
            r0.zzd(r7)
        L13:
            com.google.android.gms.internal.measurement.zzib r7 = com.google.android.gms.internal.measurement.zzic.zze()
            java.util.BitSet r1 = r6.zze
            java.util.List r1 = com.google.android.gms.measurement.internal.zzqa.zzu(r1)
            r7.zzb(r1)
            java.util.BitSet r1 = r6.zzf
            java.util.List r1 = com.google.android.gms.measurement.internal.zzqa.zzu(r1)
            r7.zzd(r1)
            java.util.Map r1 = r6.zzg
            if (r1 != 0) goto L2f
            r1 = 0
            goto L79
        L2f:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r1.size()
            r2.<init>(r1)
            java.util.Map r1 = r6.zzg
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map r4 = r6.zzg
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L42
            com.google.android.gms.internal.measurement.zzhj r5 = com.google.android.gms.internal.measurement.zzhk.zzc()
            r5.zzb(r3)
            long r3 = r4.longValue()
            r5.zza(r3)
            com.google.android.gms.internal.measurement.zzmd r3 = r5.zzba()
            com.google.android.gms.internal.measurement.zzhk r3 = (com.google.android.gms.internal.measurement.zzhk) r3
            r2.add(r3)
            goto L42
        L78:
            r1 = r2
        L79:
            if (r1 == 0) goto L7e
            r7.zza(r1)
        L7e:
            java.util.Map r1 = r6.zzh
            if (r1 != 0) goto L87
            java.util.List r1 = java.util.Collections.emptyList()
            goto Lcc
        L87:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r1.size()
            r2.<init>(r1)
            java.util.Map r1 = r6.zzh
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L9a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.google.android.gms.internal.measurement.zzid r4 = com.google.android.gms.internal.measurement.zzie.zzd()
            int r5 = r3.intValue()
            r4.zzb(r5)
            java.util.Map r5 = r6.zzh
            java.lang.Object r3 = r5.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto Lc1
            java.util.Collections.sort(r3)
            r4.zza(r3)
        Lc1:
            com.google.android.gms.internal.measurement.zzmd r3 = r4.zzba()
            com.google.android.gms.internal.measurement.zzie r3 = (com.google.android.gms.internal.measurement.zzie) r3
            r2.add(r3)
            goto L9a
        Lcb:
            r1 = r2
        Lcc:
            r7.zzc(r1)
            r0.zzb(r7)
            com.google.android.gms.internal.measurement.zzmd r7 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhi r7 = (com.google.android.gms.internal.measurement.zzhi) r7
            return r7
    }

    final void zzc(com.google.android.gms.measurement.internal.zzab r10) {
            r9 = this;
            int r0 = r10.zza()
            java.lang.Boolean r1 = r10.zzd
            if (r1 == 0) goto L11
            java.util.BitSet r2 = r9.zzf
            r1.booleanValue()
            r1 = 1
            r2.set(r0, r1)
        L11:
            java.lang.Boolean r1 = r10.zze
            if (r1 == 0) goto L1e
            java.util.BitSet r2 = r9.zze
            boolean r1 = r1.booleanValue()
            r2.set(r0, r1)
        L1e:
            java.lang.Long r1 = r10.zzf
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 == 0) goto L4a
            java.util.Map r1 = r9.zzg
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Long r5 = r10.zzf
            long r5 = r5.longValue()
            long r5 = r5 / r2
            if (r1 == 0) goto L41
            long r7 = r1.longValue()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L4a
        L41:
            java.util.Map r1 = r9.zzg
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.put(r4, r5)
        L4a:
            java.lang.Long r1 = r10.zzg
            if (r1 == 0) goto Lbf
            java.util.Map r1 = r9.zzh
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L66
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r4 = r9.zzh
            r4.put(r0, r1)
        L66:
            boolean r0 = r10.zzc()
            if (r0 == 0) goto L6f
            r1.clear()
        L6f:
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzae r0 = r9.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r4 = r0.zzf()
            java.lang.String r5 = r9.zzb
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaE
            boolean r4 = r4.zzx(r5, r6)
            if (r4 == 0) goto L8d
            boolean r4 = r10.zzb()
            if (r4 == 0) goto L8d
            r1.clear()
        L8d:
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            java.lang.String r4 = r9.zzb
            boolean r0 = r0.zzx(r4, r6)
            if (r0 == 0) goto Lb1
            java.lang.Long r10 = r10.zzg
            long r4 = r10.longValue()
            long r4 = r4 / r2
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            boolean r0 = r1.contains(r10)
            if (r0 != 0) goto Lbf
            r1.add(r10)
            return
        Lb1:
            java.lang.Long r10 = r10.zzg
            long r4 = r10.longValue()
            long r4 = r4 / r2
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r1.add(r10)
        Lbf:
            return
    }
}
