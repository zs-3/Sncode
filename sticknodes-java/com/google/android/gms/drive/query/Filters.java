package com.google.android.gms.drive.query;

/* loaded from: classes.dex */
public class Filters {
    public Filters() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.drive.query.Filter and(com.google.android.gms.drive.query.Filter r2, com.google.android.gms.drive.query.Filter... r3) {
            java.lang.String r0 = "Filter may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Additional filters may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzr r0 = new com.google.android.gms.drive.query.internal.zzr
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmv
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter and(java.lang.Iterable<com.google.android.gms.drive.query.Filter> r2) {
            java.lang.String r0 = "Filters may not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.drive.query.internal.zzr r0 = new com.google.android.gms.drive.query.internal.zzr
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmv
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter contains(com.google.android.gms.drive.metadata.SearchableMetadataField<java.lang.String> r2, java.lang.String r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmy
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter eq(com.google.android.gms.drive.metadata.CustomPropertyKey r3, java.lang.String r4) {
            java.lang.String r0 = "Custom property key may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "Custom property value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            com.google.android.gms.drive.query.internal.zzn r0 = new com.google.android.gms.drive.query.internal.zzn
            com.google.android.gms.drive.metadata.SearchableMetadataField<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> r1 = com.google.android.gms.drive.query.SearchableField.zzlv
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r2 = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza
            r2.<init>()
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$zza r3 = r2.zza(r3, r4)
            com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties r3 = r3.zzbb()
            r0.<init>(r1, r3)
            return r0
    }

    public static <T> com.google.android.gms.drive.query.Filter eq(com.google.android.gms.drive.metadata.SearchableMetadataField<T> r2, T r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmq
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter greaterThan(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> r2, T r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmt
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter greaterThanEquals(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> r2, T r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmu
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T> com.google.android.gms.drive.query.Filter in(com.google.android.gms.drive.metadata.SearchableCollectionMetadataField<T> r1, T r2) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.drive.query.internal.zzp r0 = new com.google.android.gms.drive.query.internal.zzp
            r0.<init>(r1, r2)
            return r0
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter lessThan(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> r2, T r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmr
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <T extends java.lang.Comparable<T>> com.google.android.gms.drive.query.Filter lessThanEquals(com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<T> r2, T r3) {
            java.lang.String r0 = "Field may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Value may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzb r0 = new com.google.android.gms.drive.query.internal.zzb
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzms
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter not(com.google.android.gms.drive.query.Filter r1) {
            java.lang.String r0 = "Filter may not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            com.google.android.gms.drive.query.internal.zzv r0 = new com.google.android.gms.drive.query.internal.zzv
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter openedByMe() {
            com.google.android.gms.drive.query.internal.zzd r0 = new com.google.android.gms.drive.query.internal.zzd
            com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<java.util.Date> r1 = com.google.android.gms.drive.query.SearchableField.LAST_VIEWED_BY_ME
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter or(com.google.android.gms.drive.query.Filter r2, com.google.android.gms.drive.query.Filter... r3) {
            java.lang.String r0 = "Filter may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Additional filters may not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.drive.query.internal.zzr r0 = new com.google.android.gms.drive.query.internal.zzr
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmw
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter or(java.lang.Iterable<com.google.android.gms.drive.query.Filter> r2) {
            java.lang.String r0 = "Filters may not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.drive.query.internal.zzr r0 = new com.google.android.gms.drive.query.internal.zzr
            com.google.android.gms.drive.query.internal.zzx r1 = com.google.android.gms.drive.query.internal.zzx.zzmw
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.drive.query.Filter ownedByMe() {
            com.google.android.gms.drive.query.internal.zzz r0 = new com.google.android.gms.drive.query.internal.zzz
            r0.<init>()
            return r0
    }

    public static com.google.android.gms.drive.query.Filter sharedWithMe() {
            com.google.android.gms.drive.query.internal.zzd r0 = new com.google.android.gms.drive.query.internal.zzd
            com.google.android.gms.drive.metadata.SearchableOrderedMetadataField<java.util.Date> r1 = com.google.android.gms.drive.query.SearchableField.zzlu
            r0.<init>(r1)
            return r0
    }
}
