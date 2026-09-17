package com.google.android.gms.drive.query;

/* loaded from: classes.dex */
public final class zzd implements com.google.android.gms.drive.query.internal.zzj<java.lang.String> {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.metadata.zzb r3, java.lang.Object r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getName()
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "contains(%s,%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.query.internal.zzx r3, com.google.android.gms.drive.metadata.MetadataField r4, java.lang.Object r5) {
            r2 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getTag()
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = r4.getName()
            r4 = 1
            r0[r4] = r3
            r3 = 2
            r0[r3] = r5
            java.lang.String r3 = "cmp(%s,%s,%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(com.google.android.gms.drive.query.internal.zzx r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.getTag()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "("
            java.lang.String r3 = r3.concat(r1)
            r0.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
            java.lang.String r4 = ""
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = ","
            goto L19
        L2e:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zza(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "not(%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzbj() {
            r1 = this;
            java.lang.String r0 = "ownedByMe()"
            return r0
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzbk() {
            r1 = this;
            java.lang.String r0 = "all()"
            return r0
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzc(com.google.android.gms.drive.metadata.MetadataField r3, java.lang.Object r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getName()
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "has(%s,%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zze(com.google.android.gms.drive.metadata.MetadataField r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getName()
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "fieldOnly(%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.String zzi(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "fullTextSearch(%s)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }
}
