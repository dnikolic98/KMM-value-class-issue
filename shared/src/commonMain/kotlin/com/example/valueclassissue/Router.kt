import kotlin.jvm.JvmInline
import kotlinx.serialization.Serializable

// Value class definition
@JvmInline
@Serializable
value class UserId(val value: Long)

// Interface definition
interface Router {

  fun openScreen(allIds: List<UserId>, selectedId: UserId)
}