package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfgs {
    public final java.util.List zza;
    public final com.google.android.gms.internal.ads.zzfgk zzb;
    public final java.util.List zzc;
    public final com.google.android.gms.internal.ads.zzbwa zzd;

    zzfgs(android.util.JsonReader r9, com.google.android.gms.internal.ads.zzbwa r10) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException, java.lang.AssertionError {
            r8 = this;
            r8.<init>()
            r8.zzd = r10
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2e
            if (r10 == 0) goto L2e
            android.os.Bundle r0 = r10.zzm
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzp
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L2e:
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.beginObject()
            r2 = 0
            r3 = r2
        L3c:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L11c
            java.lang.String r4 = r9.nextName()
            java.lang.String r5 = "responses"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto Lcb
            r9.beginArray()
            r9.beginObject()
        L54:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lc3
            java.lang.String r4 = r9.nextName()
            java.lang.String r5 = "ad_configs"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L81
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.beginArray()
        L6e:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L7d
            com.google.android.gms.internal.ads.zzfgh r4 = new com.google.android.gms.internal.ads.zzfgh
            r4.<init>(r9)
            r0.add(r4)
            goto L6e
        L7d:
            r9.endArray()
            goto L54
        L81:
            java.lang.String r5 = "common"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lbf
            com.google.android.gms.internal.ads.zzfgk r3 = new com.google.android.gms.internal.ads.zzfgk
            r3.<init>(r9)
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcg
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L54
            if (r10 == 0) goto L54
            android.os.Bundle r4 = r10.zzm
            if (r4 == 0) goto L54
            com.google.android.gms.internal.ads.zzdtm r5 = com.google.android.gms.internal.ads.zzdtm.zzm
            java.lang.String r5 = r5.zza()
            long r6 = r3.zzs
            r4.putLong(r5, r6)
            android.os.Bundle r4 = r10.zzm
            com.google.android.gms.internal.ads.zzdtm r5 = com.google.android.gms.internal.ads.zzdtm.zzn
            java.lang.String r5 = r5.zza()
            long r6 = r3.zzt
            r4.putLong(r5, r6)
            goto L54
        Lbf:
            r9.skipValue()
            goto L54
        Lc3:
            r9.endObject()
            r9.endArray()
            goto L3c
        Lcb:
            java.lang.String r5 = "actions"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3c
            r9.beginArray()
        Ld6:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L117
            r9.beginObject()
            r4 = r2
            r5 = r4
        Le1:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L109
            java.lang.String r6 = r9.nextName()
            java.lang.String r7 = "name"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto Lf8
            java.lang.String r4 = r9.nextString()
            goto Le1
        Lf8:
            java.lang.String r7 = "info"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L105
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbs.zzi(r9)
            goto Le1
        L105:
            r9.skipValue()
            goto Le1
        L109:
            if (r4 == 0) goto L113
            com.google.android.gms.internal.ads.zzfgr r6 = new com.google.android.gms.internal.ads.zzfgr
            r6.<init>(r4, r5)
            r1.add(r6)
        L113:
            r9.endObject()
            goto Ld6
        L117:
            r9.endArray()
            goto L3c
        L11c:
            r8.zzc = r1
            r8.zza = r0
            if (r3 != 0) goto L133
            com.google.android.gms.internal.ads.zzfgk r3 = new com.google.android.gms.internal.ads.zzfgk
            android.util.JsonReader r9 = new android.util.JsonReader
            java.io.StringReader r10 = new java.io.StringReader
            java.lang.String r0 = "{}"
            r10.<init>(r0)
            r9.<init>(r10)
            r3.<init>(r9)
        L133:
            r8.zzb = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzfgs zza(java.io.Reader r2, com.google.android.gms.internal.ads.zzbwa r3) throws com.google.android.gms.internal.ads.zzfgl {
            com.google.android.gms.internal.ads.zzfgs r0 = new com.google.android.gms.internal.ads.zzfgs     // Catch: java.lang.Throwable -> Le java.lang.AssertionError -> L10 java.lang.NumberFormatException -> L12 org.json.JSONException -> L14 java.lang.IllegalStateException -> L16 java.io.IOException -> L18
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch: java.lang.Throwable -> Le java.lang.AssertionError -> L10 java.lang.NumberFormatException -> L12 org.json.JSONException -> L14 java.lang.IllegalStateException -> L16 java.io.IOException -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le java.lang.AssertionError -> L10 java.lang.NumberFormatException -> L12 org.json.JSONException -> L14 java.lang.IllegalStateException -> L16 java.io.IOException -> L18
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le java.lang.AssertionError -> L10 java.lang.NumberFormatException -> L12 org.json.JSONException -> L14 java.lang.IllegalStateException -> L16 java.io.IOException -> L18
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            return r0
        Le:
            r3 = move-exception
            goto L21
        L10:
            r3 = move-exception
            goto L19
        L12:
            r3 = move-exception
            goto L19
        L14:
            r3 = move-exception
            goto L19
        L16:
            r3 = move-exception
            goto L19
        L18:
            r3 = move-exception
        L19:
            com.google.android.gms.internal.ads.zzfgl r0 = new com.google.android.gms.internal.ads.zzfgl     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "unable to parse ServerResponse"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L21:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            throw r3
    }
}
