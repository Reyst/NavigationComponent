package reyst.gsihome.research.nc.ui

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

interface AbstractData: Parcelable {

    val id: String
    val counter: Int

    fun map() : String

}

@Parcelize
data class Data1(
    override val id: String,
    override val counter: Int
) : AbstractData {
    override fun map(): String = "data1: $id:$counter"
}

@Parcelize
data class Data2(
    override val id: String,
    override val counter: Int
) : AbstractData {
    override fun map(): String = "data2: $counter:$id"
}

