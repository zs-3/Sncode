package com.google.android.gms.drive;

/* loaded from: classes.dex */
public abstract class Metadata implements com.google.android.gms.common.data.Freezable<com.google.android.gms.drive.Metadata> {
    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    public Metadata() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAlternateLink() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzjm
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int getContentAvailability() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Integer> r0 = com.google.android.gms.internal.drive.zzin.zzlk
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r0.intValue()
            return r0
    }

    public java.util.Date getCreatedDate() {
            r1 = this;
            com.google.android.gms.internal.drive.zzig r0 = com.google.android.gms.internal.drive.zzif.zzld
            java.lang.Object r0 = r1.zza(r0)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> getCustomProperties() {
            r1 = this;
            com.google.android.gms.internal.drive.zzhv r0 = com.google.android.gms.internal.drive.zzhs.zzjn
            java.lang.Object r0 = r1.zza(r0)
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) r0
            if (r0 != 0) goto Lf
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        Lf:
            java.util.Map r0 = r0.zzba()
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzjo
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<com.google.android.gms.drive.DriveId> r0 = com.google.android.gms.internal.drive.zzhs.zzjl
            java.lang.Object r0 = r1.zza(r0)
            com.google.android.gms.drive.DriveId r0 = (com.google.android.gms.drive.DriveId) r0
            return r0
    }

    public java.lang.String getEmbedLink() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzjp
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getFileExtension() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzjq
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public long getFileSize() {
            r2 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Long> r0 = com.google.android.gms.internal.drive.zzhs.zzjr
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    public java.util.Date getLastViewedByMeDate() {
            r1 = this;
            com.google.android.gms.internal.drive.zzih r0 = com.google.android.gms.internal.drive.zzif.zzle
            java.lang.Object r0 = r1.zza(r0)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.lang.String getMimeType() {
            r1 = this;
            com.google.android.gms.internal.drive.zzhx r0 = com.google.android.gms.internal.drive.zzhs.zzki
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.util.Date getModifiedByMeDate() {
            r1 = this;
            com.google.android.gms.internal.drive.zzii r0 = com.google.android.gms.internal.drive.zzif.zzlg
            java.lang.Object r0 = r1.zza(r0)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.util.Date getModifiedDate() {
            r1 = this;
            com.google.android.gms.internal.drive.zzij r0 = com.google.android.gms.internal.drive.zzif.zzlf
            java.lang.Object r0 = r1.zza(r0)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.lang.String getOriginalFilename() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzkj
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public long getQuotaBytesUsed() {
            r2 = this;
            com.google.android.gms.internal.drive.zzhy r0 = com.google.android.gms.internal.drive.zzhs.zzko
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    public java.util.Date getSharedWithMeDate() {
            r1 = this;
            com.google.android.gms.internal.drive.zzil r0 = com.google.android.gms.internal.drive.zzif.zzlh
            java.lang.Object r0 = r1.zza(r0)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            com.google.android.gms.internal.drive.zzib r0 = com.google.android.gms.internal.drive.zzhs.zzkr
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getWebContentLink() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzkt
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getWebViewLink() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r0 = com.google.android.gms.internal.drive.zzhs.zzku
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public boolean isEditable() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzjx
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isExplicitlyTrashed() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzjy
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isFolder() {
            r2 = this;
            java.lang.String r0 = r2.getMimeType()
            java.lang.String r1 = "application/vnd.google-apps.folder"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public boolean isInAppFolder() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzjv
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isPinnable() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzin.zzll
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isPinned() {
            r1 = this;
            com.google.android.gms.internal.drive.zzhw r0 = com.google.android.gms.internal.drive.zzhs.zzka
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isRestricted() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkc
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isShared() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkd
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isStarred() {
            r1 = this;
            com.google.android.gms.internal.drive.zzia r0 = com.google.android.gms.internal.drive.zzhs.zzkp
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isTrashable() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkg
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L13
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public boolean isTrashed() {
            r1 = this;
            com.google.android.gms.internal.drive.zzic r0 = com.google.android.gms.internal.drive.zzhs.zzks
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isViewed() {
            r1 = this;
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkh
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public abstract <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> r1);
}
