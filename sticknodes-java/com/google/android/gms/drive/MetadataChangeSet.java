package com.google.android.gms.drive;

/* loaded from: classes.dex */
public final class MetadataChangeSet {
    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final com.google.android.gms.drive.MetadataChangeSet zzax = null;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzay;

    public static class Builder {
        private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzay;
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzaz;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe()
                r1.zzay = r0
                return
        }

        private static void zza(java.lang.String r5, int r6, int r7) {
                r0 = 1
                r1 = 0
                if (r7 > r6) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                java.util.Locale r3 = java.util.Locale.US
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
                r4[r0] = r5
                r5 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r4[r5] = r6
                java.lang.String r5 = "%s must be no more than %d bytes, but is %d bytes."
                java.lang.String r5 = java.lang.String.format(r3, r5, r4)
                com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r5)
                return
        }

        private static int zzb(java.lang.String r0) {
                if (r0 != 0) goto L4
                r0 = 0
                return r0
            L4:
                byte[] r0 = r0.getBytes()
                int r0 = r0.length
                return r0
        }

        private final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzr() {
                r1 = this;
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = r1.zzaz
                if (r0 != 0) goto Lb
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza
                r0.<init>()
                r1.zzaz = r0
            Lb:
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = r1.zzaz
                return r0
        }

        public com.google.android.gms.drive.MetadataChangeSet build() {
                r3 = this;
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = r3.zzaz
                if (r0 == 0) goto Lf
                com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r3.zzay
                com.google.android.gms.internal.drive.zzhv r2 = com.google.android.gms.internal.drive.zzhs.zzjn
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = r0.zzbb()
                r1.zzb(r2, r0)
            Lf:
                com.google.android.gms.drive.MetadataChangeSet r0 = new com.google.android.gms.drive.MetadataChangeSet
                com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r3.zzay
                r0.<init>(r1)
                return r0
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder deleteCustomProperty(com.google.android.gms.drive.metadata.CustomPropertyKey r3) {
                r2 = this;
                java.lang.String r0 = "key"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = r2.zzr()
                r1 = 0
                r0.zza(r3, r1)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setCustomProperty(com.google.android.gms.drive.metadata.CustomPropertyKey r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "key"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
                java.lang.String r0 = "value"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
                java.lang.String r0 = r4.getKey()
                int r0 = zzb(r0)
                int r1 = zzb(r5)
                int r0 = r0 + r1
                java.lang.String r1 = "The total size of key string and value string of a custom property"
                r2 = 124(0x7c, float:1.74E-43)
                zza(r1, r2, r0)
                com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r0 = r3.zzr()
                r0.zza(r4, r5)
                return r3
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setDescription(java.lang.String r3) {
                r2 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r1 = com.google.android.gms.internal.drive.zzhs.zzjo
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setIndexableText(java.lang.String r4) {
                r3 = this;
                int r0 = zzb(r4)
                java.lang.String r1 = "Indexable text size"
                r2 = 131072(0x20000, float:1.83671E-40)
                zza(r1, r2, r0)
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r3.zzay
                com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r1 = com.google.android.gms.internal.drive.zzhs.zzju
                r0.zzb(r1, r4)
                return r3
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setLastViewedByMeDate(java.util.Date r3) {
                r2 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.internal.drive.zzih r1 = com.google.android.gms.internal.drive.zzif.zzle
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setMimeType(java.lang.String r3) {
                r2 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.internal.drive.zzhx r1 = com.google.android.gms.internal.drive.zzhs.zzki
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setPinned(boolean r3) {
                r2 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.internal.drive.zzhw r1 = com.google.android.gms.internal.drive.zzhs.zzka
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setStarred(boolean r3) {
                r2 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.internal.drive.zzia r1 = com.google.android.gms.internal.drive.zzhs.zzkp
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setTitle(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Title cannot be null."
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
                com.google.android.gms.internal.drive.zzib r1 = com.google.android.gms.internal.drive.zzhs.zzkr
                r0.zzb(r1, r3)
                return r2
        }

        public com.google.android.gms.drive.MetadataChangeSet.Builder setViewed() {
                r3 = this;
                com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r3.zzay
                com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r1 = com.google.android.gms.internal.drive.zzhs.zzkh
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r0.zzb(r1, r2)
                return r3
        }

        @java.lang.Deprecated
        public com.google.android.gms.drive.MetadataChangeSet.Builder setViewed(boolean r3) {
                r2 = this;
                if (r3 == 0) goto Lc
                com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r2.zzay
                com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkh
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r3.zzb(r0, r1)
                goto L1b
            Lc:
                com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r2.zzay
                com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r0 = com.google.android.gms.internal.drive.zzhs.zzkh
                boolean r3 = r3.zzd(r0)
                if (r3 == 0) goto L1b
                com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r2.zzay
                r3.zzc(r0)
            L1b:
                return r2
        }
    }

    static {
            com.google.android.gms.drive.MetadataChangeSet r0 = new com.google.android.gms.drive.MetadataChangeSet
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = com.google.android.gms.drive.metadata.internal.MetadataBundle.zzbe()
            r0.<init>(r1)
            com.google.android.gms.drive.MetadataChangeSet.zzax = r0
            return
    }

    public MetadataChangeSet(com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r1.zzbf()
            r0.zzay = r1
            return
    }

    public final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> getCustomPropertyChangeMap() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzhv r1 = com.google.android.gms.internal.drive.zzhs.zzjn
            java.lang.Object r0 = r0.zza(r1)
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r0 = (com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) r0
            if (r0 != 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        L11:
            java.util.Map r0 = r0.zzba()
            return r0
    }

    public final java.lang.String getDescription() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r1 = com.google.android.gms.internal.drive.zzhs.zzjo
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.String getIndexableText() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.drive.metadata.MetadataField<java.lang.String> r1 = com.google.android.gms.internal.drive.zzhs.zzju
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.util.Date getLastViewedByMeDate() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzih r1 = com.google.android.gms.internal.drive.zzif.zzle
            java.lang.Object r0 = r0.zza(r1)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }

    public final java.lang.String getMimeType() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzhx r1 = com.google.android.gms.internal.drive.zzhs.zzki
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public final android.graphics.Bitmap getThumbnail() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.drive.metadata.MetadataField<com.google.android.gms.common.data.BitmapTeleporter> r1 = com.google.android.gms.internal.drive.zzhs.zzkq
            java.lang.Object r0 = r0.zza(r1)
            com.google.android.gms.common.data.BitmapTeleporter r0 = (com.google.android.gms.common.data.BitmapTeleporter) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            android.graphics.Bitmap r0 = r0.get()
            return r0
    }

    public final java.lang.String getTitle() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzib r1 = com.google.android.gms.internal.drive.zzhs.zzkr
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.Boolean isPinned() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzhw r1 = com.google.android.gms.internal.drive.zzhs.zzka
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public final java.lang.Boolean isStarred() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.internal.drive.zzia r1 = com.google.android.gms.internal.drive.zzhs.zzkp
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public final java.lang.Boolean isViewed() {
            r2 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r2.zzay
            com.google.android.gms.drive.metadata.MetadataField<java.lang.Boolean> r1 = com.google.android.gms.internal.drive.zzhs.zzkh
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzq() {
            r1 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r1.zzay
            return r0
    }
}
