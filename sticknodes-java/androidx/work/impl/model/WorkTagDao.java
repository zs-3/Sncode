package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkTagDao {
    java.util.List<java.lang.String> getTagsForWorkSpecId(java.lang.String r1);

    void insert(androidx.work.impl.model.WorkTag r1);
}
