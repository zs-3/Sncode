package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class BoxFactory {
    private static org.jcodec.containers.mp4.boxes.BoxFactory instance;
    private final java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> mappings;

    static {
            org.jcodec.containers.mp4.boxes.BoxFactory r0 = new org.jcodec.containers.mp4.boxes.BoxFactory
            r0.<init>()
            org.jcodec.containers.mp4.boxes.BoxFactory.instance = r0
            return
    }

    public BoxFactory() {
            r5 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.LeafBox> r0 = org.jcodec.containers.mp4.boxes.LeafBox.class
            java.lang.Class<org.jcodec.containers.mp4.boxes.NodeBox> r1 = org.jcodec.containers.mp4.boxes.NodeBox.class
            r5.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5.mappings = r2
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MovieExtendsBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieExtendsBox> r4 = org.jcodec.containers.mp4.boxes.MovieExtendsBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MovieExtendsHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieExtendsHeaderBox> r4 = org.jcodec.containers.mp4.boxes.MovieExtendsHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SegmentIndexBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SegmentIndexBox> r4 = org.jcodec.containers.mp4.boxes.SegmentIndexBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SegmentTypeBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SegmentTypeBox> r4 = org.jcodec.containers.mp4.boxes.SegmentTypeBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.TrackExtendsBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrackExtendsBox> r4 = org.jcodec.containers.mp4.boxes.TrackExtendsBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox> r4 = org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.FileTypeBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.FileTypeBox> r4 = org.jcodec.containers.mp4.boxes.FileTypeBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MovieBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieBox> r4 = org.jcodec.containers.mp4.boxes.MovieBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MovieHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieHeaderBox> r4 = org.jcodec.containers.mp4.boxes.MovieHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.TrakBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrakBox> r4 = org.jcodec.containers.mp4.boxes.TrakBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.TrackHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrackHeaderBox> r4 = org.jcodec.containers.mp4.boxes.TrackHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "edts"
            r2.put(r3, r1)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.EditListBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.EditListBox> r4 = org.jcodec.containers.mp4.boxes.EditListBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MediaBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MediaBox> r4 = org.jcodec.containers.mp4.boxes.MediaBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MediaHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MediaHeaderBox> r4 = org.jcodec.containers.mp4.boxes.MediaHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.MediaInfoBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MediaInfoBox> r4 = org.jcodec.containers.mp4.boxes.MediaInfoBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.HandlerBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.HandlerBox> r4 = org.jcodec.containers.mp4.boxes.HandlerBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.DataInfoBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.DataInfoBox> r4 = org.jcodec.containers.mp4.boxes.DataInfoBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "stbl"
            r2.put(r3, r1)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SampleDescriptionBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SampleDescriptionBox> r4 = org.jcodec.containers.mp4.boxes.SampleDescriptionBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.TimeToSampleBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TimeToSampleBox> r4 = org.jcodec.containers.mp4.boxes.TimeToSampleBox.class
            r2.put(r3, r4)
            java.lang.Class<org.jcodec.containers.mp4.boxes.SyncSamplesBox> r3 = org.jcodec.containers.mp4.boxes.SyncSamplesBox.class
            java.lang.String r4 = "stss"
            r2.put(r4, r3)
            java.lang.Class<org.jcodec.containers.mp4.boxes.PartialSyncSamplesBox> r3 = org.jcodec.containers.mp4.boxes.PartialSyncSamplesBox.class
            java.lang.String r4 = "stps"
            r2.put(r4, r3)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SampleToChunkBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SampleToChunkBox> r4 = org.jcodec.containers.mp4.boxes.SampleToChunkBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SampleSizesBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SampleSizesBox> r4 = org.jcodec.containers.mp4.boxes.SampleSizesBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.ChunkOffsetsBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.ChunkOffsetsBox> r4 = org.jcodec.containers.mp4.boxes.ChunkOffsetsBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "mvex"
            r2.put(r3, r1)
            java.lang.String r3 = "moof"
            r2.put(r3, r1)
            java.lang.String r3 = "traf"
            r2.put(r3, r1)
            java.lang.String r3 = "mfra"
            r2.put(r3, r1)
            java.lang.String r3 = "skip"
            r2.put(r3, r1)
            java.lang.String r3 = "meta"
            r2.put(r3, r0)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.DataRefBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.DataRefBox> r4 = org.jcodec.containers.mp4.boxes.DataRefBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "ipro"
            r2.put(r3, r1)
            java.lang.String r3 = "sinf"
            r2.put(r3, r1)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.ChunkOffsets64Box.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.ChunkOffsets64Box> r4 = org.jcodec.containers.mp4.boxes.ChunkOffsets64Box.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox> r4 = org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "clip"
            r2.put(r3, r1)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.ClipRegionBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.ClipRegionBox> r4 = org.jcodec.containers.mp4.boxes.ClipRegionBox.class
            r2.put(r3, r4)
            java.lang.String r3 = org.jcodec.containers.mp4.boxes.LoadSettingsBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.LoadSettingsBox> r4 = org.jcodec.containers.mp4.boxes.LoadSettingsBox.class
            r2.put(r3, r4)
            java.lang.String r3 = "tapt"
            r2.put(r3, r1)
            java.lang.String r3 = "gmhd"
            r2.put(r3, r1)
            java.lang.String r3 = "tmcd"
            r2.put(r3, r0)
            java.lang.String r0 = "tref"
            r2.put(r0, r1)
            java.lang.Class<org.jcodec.containers.mp4.boxes.ClearApertureBox> r0 = org.jcodec.containers.mp4.boxes.ClearApertureBox.class
            java.lang.String r3 = "clef"
            r2.put(r3, r0)
            java.lang.Class<org.jcodec.containers.mp4.boxes.ProductionApertureBox> r0 = org.jcodec.containers.mp4.boxes.ProductionApertureBox.class
            java.lang.String r3 = "prof"
            r2.put(r3, r0)
            java.lang.Class<org.jcodec.containers.mp4.boxes.EncodedPixelBox> r0 = org.jcodec.containers.mp4.boxes.EncodedPixelBox.class
            java.lang.String r3 = "enof"
            r2.put(r3, r0)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.GenericMediaInfoBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.GenericMediaInfoBox> r3 = org.jcodec.containers.mp4.boxes.GenericMediaInfoBox.class
            r2.put(r0, r3)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox> r3 = org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox.class
            r2.put(r0, r3)
            java.lang.String r0 = "udta"
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox> r1 = org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.NameBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.NameBox> r1 = org.jcodec.containers.mp4.boxes.NameBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.MovieFragmentHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieFragmentHeaderBox> r1 = org.jcodec.containers.mp4.boxes.MovieFragmentHeaderBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.TrackFragmentHeaderBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrackFragmentHeaderBox> r1 = org.jcodec.containers.mp4.boxes.TrackFragmentHeaderBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.MovieFragmentBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.MovieFragmentBox> r1 = org.jcodec.containers.mp4.boxes.MovieFragmentBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.TrackFragmentBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrackFragmentBox> r1 = org.jcodec.containers.mp4.boxes.TrackFragmentBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.TrackFragmentBaseMediaDecodeTimeBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrackFragmentBaseMediaDecodeTimeBox> r1 = org.jcodec.containers.mp4.boxes.TrackFragmentBaseMediaDecodeTimeBox.class
            r2.put(r0, r1)
            java.lang.String r0 = org.jcodec.containers.mp4.boxes.TrunBox.fourcc()
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrunBox> r1 = org.jcodec.containers.mp4.boxes.TrunBox.class
            r2.put(r0, r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.BoxFactory getDefault() {
            org.jcodec.containers.mp4.boxes.BoxFactory r0 = org.jcodec.containers.mp4.boxes.BoxFactory.instance
            return r0
    }

    public void clear() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r1.mappings
            r0.clear()
            return
    }

    public void override(java.lang.String r2, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box> r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r1.mappings
            r0.put(r2, r3)
            return
    }

    public java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box> toClass(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<? extends org.jcodec.containers.mp4.boxes.Box>> r0 = r1.mappings
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }
}
