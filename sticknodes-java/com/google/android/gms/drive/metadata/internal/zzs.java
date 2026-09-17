package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.drive.metadata.zzb<java.lang.String> {
    public zzs(java.lang.String r3, int r4) {
            r2 = this;
            java.util.Set r4 = java.util.Collections.singleton(r3)
            java.util.Set r0 = java.util.Collections.emptySet()
            r1 = 4300000(0x419ce0, float:6.025583E-39)
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r3, java.lang.Object r4) {
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.String r0 = r2.getName()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            r3.putStringArrayList(r0, r1)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.util.ArrayList r2 = r2.getStringArrayList(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.util.Collection r1 = r0.zzd(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.zzb
    protected final java.util.Collection<java.lang.String> zzd(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = r1.getName()     // Catch: org.json.JSONException -> L2c
            java.lang.String r2 = r2.getString(r0, r3, r4)     // Catch: org.json.JSONException -> L2c
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> L2c
            r3.<init>()     // Catch: org.json.JSONException -> L2c
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L2c
            r4.<init>(r2)     // Catch: org.json.JSONException -> L2c
            r2 = 0
        L17:
            int r0 = r4.length()     // Catch: org.json.JSONException -> L2c
            if (r2 >= r0) goto L27
            java.lang.String r0 = r4.getString(r2)     // Catch: org.json.JSONException -> L2c
            r3.add(r0)     // Catch: org.json.JSONException -> L2c
            int r2 = r2 + 1
            goto L17
        L27:
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r3)     // Catch: org.json.JSONException -> L2c
            return r2
        L2c:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "DataHolder supplied invalid JSON"
            r3.<init>(r4, r2)
            throw r3
    }
}
