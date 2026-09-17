package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfjb implements com.google.android.gms.internal.ads.zzfja {
    private final java.lang.Object[] zza;

    public zzfjb(com.google.android.gms.ads.internal.client.zzm r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.ads.internal.client.zzy r7) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = ","
            java.lang.String[] r1 = r6.split(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r6)
            r1.add(r4)
            java.lang.String r4 = "networkType"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.add(r4)
        L2c:
            java.lang.String r4 = "birthday"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L3d
            long r4 = r3.zzb
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
        L3d:
            java.lang.String r4 = "extras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L4f
            android.os.Bundle r4 = r3.zzc
            java.lang.String r4 = zza(r4)
            r1.add(r4)
            goto L60
        L4f:
            java.lang.String r4 = "npa"
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L60
            android.os.Bundle r5 = r3.zzc
            java.lang.String r4 = r5.getString(r4)
            r1.add(r4)
        L60:
            java.lang.String r4 = "gender"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L71
            int r4 = r3.zzd
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L71:
            java.lang.String r4 = "keywords"
            boolean r4 = r0.contains(r4)
            r5 = 0
            if (r4 == 0) goto L89
            java.util.List r4 = r3.zze
            if (r4 == 0) goto L86
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L89
        L86:
            r1.add(r5)
        L89:
            java.lang.String r4 = "isTestDevice"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L9a
            boolean r4 = r3.zzf
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L9a:
            java.lang.String r4 = "tagForChildDirectedTreatment"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lab
            int r4 = r3.zzg
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        Lab:
            java.lang.String r4 = "manualImpressionsEnabled"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lbc
            boolean r4 = r3.zzh
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        Lbc:
            java.lang.String r4 = "publisherProvidedId"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lc9
            java.lang.String r4 = r3.zzi
            r1.add(r4)
        Lc9:
            java.lang.String r4 = "location"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Le0
            android.location.Location r4 = r3.zzk
            if (r4 == 0) goto Ldd
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto Le0
        Ldd:
            r1.add(r5)
        Le0:
            java.lang.String r4 = "contentUrl"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Led
            java.lang.String r4 = r3.zzl
            r1.add(r4)
        Led:
            java.lang.String r4 = "networkExtras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lfe
            android.os.Bundle r4 = r3.zzm
            java.lang.String r4 = zza(r4)
            r1.add(r4)
        Lfe:
            java.lang.String r4 = "customTargeting"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L10f
            android.os.Bundle r4 = r3.zzn
            java.lang.String r4 = zza(r4)
            r1.add(r4)
        L10f:
            java.lang.String r4 = "categoryExclusions"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L126
            java.util.List r4 = r3.zzo
            if (r4 == 0) goto L123
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L126
        L123:
            r1.add(r5)
        L126:
            java.lang.String r4 = "requestAgent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L133
            java.lang.String r4 = r3.zzp
            r1.add(r4)
        L133:
            java.lang.String r4 = "requestPackage"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L140
            java.lang.String r4 = r3.zzq
            r1.add(r4)
        L140:
            java.lang.String r4 = "isDesignedForFamilies"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L151
            boolean r4 = r3.zzr
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L151:
            java.lang.String r4 = "tagForUnderAgeOfConsent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L162
            int r4 = r3.zzt
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L162:
            java.lang.String r4 = "maxAdContentRating"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L16f
            java.lang.String r3 = r3.zzu
            r1.add(r3)
        L16f:
            java.lang.String r3 = "orientation"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L186
            if (r7 == 0) goto L183
            int r3 = r7.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L186
        L183:
            r1.add(r5)
        L186:
            java.lang.Object[] r3 = r1.toArray()
            r2.zza = r3
            return
    }

    private static java.lang.String zza(android.os.Bundle r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.TreeSet r1 = new java.util.TreeSet
            java.util.Set r2 = r4.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.get(r2)
            if (r2 != 0) goto L2b
            java.lang.String r2 = "null"
            goto L3a
        L2b:
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L36
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r2 = zza(r2)
            goto L3a
        L36:
            java.lang.String r2 = r2.toString()
        L3a:
            r0.append(r2)
            goto L16
        L3e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzfja
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzfjb
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.internal.ads.zzfjb r2 = (com.google.android.gms.internal.ads.zzfjb) r2
            java.lang.Object[] r0 = r1.zza
            java.lang.Object[] r2 = r2.zza
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfja
    public final int hashCode() {
            r1 = this;
            java.lang.Object[] r0 = r1.zza
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.Object[] r0 = r4.zza
            int r1 = java.util.Arrays.hashCode(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[PoolKey#"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
