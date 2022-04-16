import useSWR from "swr";
import { HelloApi, HelloDTO } from "../generated/api";

const initialValue: HelloDTO = {
  message: "",
};

export function useHello() {
  const key = "v1GetHello";
  const fetcher = (_: string) => {
    return new HelloApi().v1HelloGet().then((res) => res.data);
  };
  const { data } = useSWR(key, fetcher, { suspense: true });

  return { data: data ?? initialValue };
}
