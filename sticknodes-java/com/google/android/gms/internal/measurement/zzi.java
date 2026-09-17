package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzi {
    public static com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zziz r3) {
            if (r3 != 0) goto L5
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
        L5:
            int r0 = r3.zzj()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto L7f
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L65
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 4
            if (r0 != r1) goto L43
            java.util.List r0 = r3.zze()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zziz r2 = (com.google.android.gms.internal.measurement.zziz) r2
            com.google.android.gms.internal.measurement.zzap r2 = zza(r2)
            r1.add(r2)
            goto L25
        L39:
            java.lang.String r3 = r3.zzc()
            com.google.android.gms.internal.measurement.zzaq r0 = new com.google.android.gms.internal.measurement.zzaq
            r0.<init>(r3, r1)
            return r0
        L43:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type found. Cannot convert entity"
            r3.<init>(r0)
            throw r3
        L4b:
            boolean r0 = r3.zzg()
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            boolean r3 = r3.zzf()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.<init>(r3)
            return r0
        L5f:
            com.google.android.gms.internal.measurement.zzaf r3 = new com.google.android.gms.internal.measurement.zzaf
            r3.<init>(r2)
            return r3
        L65:
            boolean r0 = r3.zzh()
            if (r0 == 0) goto L79
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            double r1 = r3.zza()
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            r0.<init>(r3)
            return r0
        L79:
            com.google.android.gms.internal.measurement.zzah r3 = new com.google.android.gms.internal.measurement.zzah
            r3.<init>(r2)
            return r3
        L7f:
            boolean r0 = r3.zzi()
            if (r0 == 0) goto L8f
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r3 = r3.zzd()
            r0.<init>(r3)
            return r0
        L8f:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzm
            return r3
    }

    public static com.google.android.gms.internal.measurement.zzap zzb(java.lang.Object r5) {
            if (r5 != 0) goto L5
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzg
            return r5
        L5:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L11
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r5 = (java.lang.String) r5
            r0.<init>(r5)
            return r0
        L11:
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r5 = (java.lang.Double) r5
            r0.<init>(r5)
            return r0
        L1d:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L31
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Long r5 = (java.lang.Long) r5
            double r1 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r0.<init>(r5)
            return r0
        L31:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L45
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Integer r5 = (java.lang.Integer) r5
            double r1 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r1)
            r0.<init>(r5)
            return r0
        L45:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L51
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r0.<init>(r5)
            return r0
        L51:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L87
            com.google.android.gms.internal.measurement.zzam r0 = new com.google.android.gms.internal.measurement.zzam
            r0.<init>()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r5.get(r2)
            com.google.android.gms.internal.measurement.zzap r3 = zzb(r3)
            if (r2 == 0) goto L64
            boolean r4 = r2 instanceof java.lang.String
            if (r4 != 0) goto L80
            java.lang.String r2 = r2.toString()
        L80:
            java.lang.String r2 = (java.lang.String) r2
            r0.zzr(r2, r3)
            goto L64
        L86:
            return r0
        L87:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto Lad
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L96:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.measurement.zzap r1 = zzb(r1)
            int r2 = r0.zzc()
            r0.zzq(r2, r1)
            goto L96
        Lac:
            return r0
        Lad:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid value type"
            r5.<init>(r0)
            throw r5
    }
}
